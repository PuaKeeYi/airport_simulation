
package com.mycompany.oodj_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends user{
    private String customerName;
    private String customerPhoneNumber;
    
    public Customer(String a, String b, String c, String d){
        userID = a;
        userPassword = b;
        customerName = c;
        customerPhoneNumber = d;
        userRole = "customer";
    }
    
    // for show home page details to get from frmCustomer.
    public Customer(String a){
        userID = a;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
        return String.format("%s %s %s %s %s", userID,userPassword,customerName,customerPhoneNumber,userRole);
    }
    
    
    
    // show the menu list for the user to order their food.
    // showOrderTable
    public static void openTable(DefaultTableModel table){
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("Menu.txt"));
            // object array is to fill in any types of data
            Object[] items = fileHandler.lines().toArray();
            for(Object itemObject : items) {
                String currentLine = itemObject.toString().trim();
                String[] row = currentLine.split(":");
                if(row[3].equals("available")){
                    row[3] = "0";
                    table.addRow(row);
                }
            }
            fileHandler.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // the customer history maust have make payment in it
    public static void viewCustomerPersonalOrder(DefaultTableModel table, String customerID, String orderStatus){
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("Order.txt"));
            // object array is to fill in any types of data
            Object[] items = fileHandler.lines().toArray();
            for(Object itemObject : items) {
                String currentLine = itemObject.toString().trim();
                String[] row = currentLine.split("::");
                if(row[1].equals(customerID)&&row[4].equals(orderStatus)){
                    table.addRow(row);
                }
            }
            fileHandler.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void paidOrder(String orderID, String customerID){
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("Order.txt"));
            String line;
            String databuffer = "";
            boolean found = false;
            
            while((line = fileHandler.readLine()) != null){
                String[] lineBuffer = line.split("::");
                if(orderID.equals(lineBuffer[0])&&customerID.equals(lineBuffer[1])){
                    lineBuffer[4] = "paid";
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
            fileHandler.close();
            
            if(found){
                BufferedWriter fileHandler1 = new BufferedWriter(new FileWriter("Order.txt"));
                fileHandler1.write(databuffer);
                fileHandler1.close();
                JOptionPane.showMessageDialog(null, "Order Paid!");
            }else{
                JOptionPane.showMessageDialog(null, "Order not found!");
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
