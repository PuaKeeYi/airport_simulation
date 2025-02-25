
package com.mycompany.oodj_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class user {
    protected String userID;
    protected String userPassword;
    protected String userRole;
    
    
    // normal construtor
    public user(String a, String b, String d){
        userID = a;
        userPassword = b;
        userRole = d;
    }
    
    // use in frameLogin to get input.
    public user(String a, String b){
        userID = a;
        userPassword = b;
    }
    
    // construtor used prevent error when create object in inheretance
    // object created in inheritance may have different variables
    public user(){
        userID = "none";
        userPassword = "none";
        userRole = "none";
    }

    public String getUserID() {
        return userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", userID,userPassword,userRole);
    }
    
    public boolean login(){
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("userDetails.txt"));
            String line;
            //Boolean found = false; 
            while((line = fileHandler.readLine()) != null){
                String[] lineBuffer = line.split(" ");
                
                if(userID.equals(lineBuffer[0])&& userPassword.equals(lineBuffer[1])){
                    if(lineBuffer[3].equals("customer")){
                        JFrame J1 = new frmCustomer(lineBuffer[0]);
                        J1.setVisible(true);
                        //found = true;
                        return true;
                    }
                    else if (lineBuffer[3].equals("manager")){
                        JFrame J2 = new frmManager(lineBuffer[0]);
                        J2.setVisible(true);
                        //found = true;
                        return true;
                        }
                }   
            }
            fileHandler.close();
            JOptionPane.showMessageDialog(null, "Unknow ID or Wrong Password, please try again!");
        }catch(IOException e1){
            JOptionPane.showMessageDialog(null, "Unable read file!");
        }
        return false;
    }
    
    public String[] getUserDetails(String UID){
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("userDetails.txt"));
            String line;
            String[] lineBuffer = new String[5];
            
            while ((line=fileHandler.readLine())!=null){
                lineBuffer = line.split(" ");
                if(lineBuffer[0].equals (UID)){
                    return lineBuffer;
                }
            }
            return lineBuffer;
        }catch(IOException e){
            // for catch to return, if error return empty array
            String[] lineBuffer = new String[5];
            JOptionPane.showMessageDialog(null, e.toString());
            return lineBuffer;
        }
    }
    
    // password validation with condition only Upper and Lower alphabet with number
    // 5-20 char
    public static boolean passwordValidation(String password){
        if(password.matches("[a-zA-Z0-9]{5,20}")){
            return true;
        }
        return false;
    }
    // userName validation with only char accepted
    public static boolean userNameValidation(String userName){
        if(userName.matches("[a-zA-Z]{1,20}")){
            return true;
        }
        return false;
    }
    // phone numbe validation with only 10 or 11 number
    public static boolean phoneNumberValidation(String phoneNumber){
        if(phoneNumber.matches("[0-9]{10,11}")){
            return true;
        }
        return false;
    }
    
    // method to open table in GUI (Tables opened: menuTable, orderListTable, feedbackTable)
    public static void openTable(DefaultTableModel table, String txtFile, String spacingValue){
        //menuTable, orderListTable, feedbackTable
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader(txtFile));
            Object[] items = fileHandler.lines().toArray();
            for(Object itemObject : items) {
                String currentLine = itemObject.toString().trim();
                String[] row = currentLine.split(spacingValue);
                table.addRow(row);
            }
            fileHandler.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // change password of the login user
    public static void changePassword(String userID,String oldPassword,String newPassword){
        try{
            BufferedReader fileHandler1 = new BufferedReader(new FileReader("userDetails.txt"));
            String line;
            String databuffer = "";
            boolean found = true;
            
            while((line = fileHandler1.readLine()) != null){
                String[] lineBuffer = line.split(" ");
                if(userID.equals(lineBuffer[0])){
                    if(oldPassword.equals(lineBuffer[1])){
                        lineBuffer[1] = newPassword;
                        for(int i =0; i< lineBuffer.length; i++){
                            databuffer += lineBuffer[i] + " ";
                        }
                        databuffer += "\n";
                    }else{
                        JOptionPane.showMessageDialog(null, "Please enter the correct password!");
                        found = false;
                        break;
                    }
                }else{
                    databuffer += line + "\n";
                }
            }
            fileHandler1.close();
            
            if(found){
                BufferedWriter fileHandler2 = new BufferedWriter(new FileWriter("userDetails.txt"));
                fileHandler2.write(databuffer);
                fileHandler2.close();
                JOptionPane.showMessageDialog(null, "Info updated successfully!");
            }
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //capture login
    public static void captureLoggingActivity(String userID, String activityStatus) {
        String dateWithTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        String newLoggingActivity = String.format("%s;%s;%s\n", userID, dateWithTime, activityStatus);
        try{
            FileWriter newFile = new FileWriter("loggingActivity.txt",true);
            newFile.write(newLoggingActivity);
            newFile.close();
            JOptionPane.showMessageDialog(null, "ACCOUNT " + activityStatus);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
