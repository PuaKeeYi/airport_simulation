
package com.mycompany.oodj_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Manager extends user{
    private String managerName;
    private String managerPhoneNumber;
    
    public Manager(String a, String b, String c, String d){
        userID = a;
        userPassword = b;
        managerName = c;
        managerPhoneNumber = d;
        userRole = "manager";
    }
    
    // for show home page details to get from frmManager.
    public Manager(String a){
        userID = a;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getManagerPhoneNumber() {
        return managerPhoneNumber;
    }

    public void setManagerPhoneNumber(String managerPhoneNumber) {
        this.managerPhoneNumber = managerPhoneNumber;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String getUserID() {
        return super.getUserID();
    }
    
    @Override
    public String getUserPassword() {
        return super.getUserPassword();
    }

    @Override
    public String getUserRole() {
        return super.getUserRole();
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", userID,userPassword,managerName,managerPhoneNumber,userRole); 
    }
    
    
    // code for Manager to register new customer and manager.
    public static void newUserRegistration(String userName,String password, String role,String phone){
        try{
            BufferedReader fileHandler1 = new BufferedReader(new FileReader("userDetails.txt"));
            String line;
            int count = 1;
            String userID;
            String newUserDetail;
            Boolean found = false;
            
            while((line = fileHandler1.readLine()) != null){
                String[] lineBuffer = line.split(" ");
                if(userName.equals(lineBuffer[2])){
                    JOptionPane.showMessageDialog(null, "This person is already registered!");
                    found = true;
                    break;
                }
            }
            
            if(!found){
                switch (role) {
                    case "customer":
                        BufferedReader fileHandler2 = new BufferedReader(new FileReader("userDetails.txt"));
                        while((line = fileHandler2.readLine()) != null){
                            String[] lineBuffer = line.split(" ");
                            if(role.equals(lineBuffer[3])){
                                count += 1;
                            }                        
                        }
                        userID = String.format("C%05d", count);
                        break;

                    case "manager":
                        BufferedReader fileHandler3 = new BufferedReader(new FileReader("userDetails.txt"));
                        while((line = fileHandler3.readLine()) != null){
                            String[] lineBuffer = line.split(" ");
                            if(role.equals(lineBuffer[3])){
                                count += 1;
                            }                        
                        }
                        userID = String.format("M%05d", count);
                        break;
                    default:
                        throw new Exception("Cant create.");
                }
                newUserDetail = String.format("%s %s %s %s %s\n", userID, password, userName, role, phone);
                FileWriter newFile = new FileWriter("userDetails.txt",true);
                newFile.write(newUserDetail);
                newFile.close();
                JOptionPane.showMessageDialog(null, "Register Successfully");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    // view the status of the order
    public static void viewPendingOrPaidOrder(DefaultTableModel table, String orderStatus){
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("Order.txt"));
            Object[] items = fileHandler.lines().toArray();
            for(Object itemObject : items) {
                String currentLine = itemObject.toString().trim();
                String[] row = currentLine.split("::");
                if(row[4].equals (orderStatus)){
                    table.addRow(row);
                }
            }
            fileHandler.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // change the status of one order
    public static void changeOrderStatus(String orderID,String statusAfter){
        try{
            BufferedReader fileHandler1 = new BufferedReader(new FileReader("Order.txt"));
            String line;
            String databuffer = "";
            boolean found = false;
            
            while((line = fileHandler1.readLine()) != null){
                String[] lineBuffer = line.split("::");
                if(orderID.equals(lineBuffer[0])){
                    lineBuffer[4] = statusAfter;
                    for(int i =0; i< lineBuffer.length; i++){
                        databuffer += lineBuffer[i];
                        if (i != lineBuffer.length - 1){
                            databuffer += "::";
                        }
                        found = true;
                    }
                    databuffer += "\n";
                }else{
                    databuffer += line + "\n";
                }
            }
            fileHandler1.close();
            
            if(found){
                BufferedWriter fileHandler2 = new BufferedWriter(new FileWriter("Order.txt"));
                fileHandler2.write(databuffer);
                fileHandler2.close();
                JOptionPane.showMessageDialog(null, "OrderID "+orderID+" has updated to "+statusAfter+"!");
            }else{
                JOptionPane.showMessageDialog(null, "Order not found!");
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // to check the status of the order is already pending or paid
    public static boolean checkIfRepeated(String orderID, String orderStatus){
        try {
            BufferedReader fileHandler = new BufferedReader(new FileReader("Order.txt"));
            String line;
            String[] lineBuffer;
            while((line = fileHandler.readLine()) != null){
                lineBuffer = line.split("::");
                if (orderID.equals(lineBuffer[0]) && orderStatus.equals(lineBuffer[4])){
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File not found.");
            return false;
        }
    }
}
