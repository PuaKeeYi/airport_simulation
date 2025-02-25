
package com.mycompany.oodj_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class Order {
    String orderID;
    String customerID;
    String itemList;
    double totalPrice;
    String status;
    String date;
    
    // normal constructor
    public Order(String CID, String IL, double TP, String ST){
        customerID = CID;
        itemList = IL;
        totalPrice = TP;
        status = ST;
    }

    public String getOrderID() {
        return orderID;
    }
    
    public String getCustomerID() {
        return customerID;
    }

    public String getItemList() {
        return itemList;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    // generate ID for new order
    public static String generateOrderID() {
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("Order.txt"));
            String line;
            int count = 1;
            String orderID;
            while((line = fileHandler.readLine()) != null){
                count += 1;
            }
            fileHandler.close();
            orderID = String.format("OD%03d", count);
            return orderID;
        }catch(Exception e){
            String orderID;
            JOptionPane.showMessageDialog(null, e);
            return orderID = "";
        }
    }
    //method that write new order into the txt file
    public static void makeNewOrder(String newOrderDetail){
        try{
            FileWriter newFile = new FileWriter("Order.txt",true);
            newFile.write(newOrderDetail);
            newFile.close();
            JOptionPane.showMessageDialog(null, "Order Saved!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
