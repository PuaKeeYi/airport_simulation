
package com.mycompany.oodj_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FoodAndBeverage{
    String foodID;
    String foodName; 
    double foodPrice; 
    String foodState;
    
    public FoodAndBeverage(String FN, double FP, String FS){
        foodName = FN;
        foodPrice = FP;
        foodState = FS;          
    }

    public String getFoodID() {
        return foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public String getFoodState() {
        return foodState;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    public void addFoodAndBeverage(String foodType){
        try{
            BufferedReader fileHandler1 = new BufferedReader(new FileReader("Menu.txt"));
            String line;
            String foodID = null;
            String newFoodDetail;
            int count = 1;
            Boolean found = false; 
            
            while((line = fileHandler1.readLine()) != null){
                String[] lineBuffer = line.split(":");
                if(foodName.equals(lineBuffer[1])){
                    JOptionPane.showMessageDialog(null, "This item is already in the menu!");
                    found = true;
                    break;
                }
            }
            if(!found){
                if(foodType.equals("food")){
                    BufferedReader fileHandler2 = new BufferedReader(new FileReader("Menu.txt"));
                        while((line = fileHandler2.readLine()) != null){
                            char firstChar = line.charAt(0);
                            if(firstChar == 'F'){
                                count += 1;
                            }                        
                        }
                        foodID = String.format("F%d", count);
                }else if(foodType.equals("beverage")){
                    BufferedReader fileHandler3 = new BufferedReader(new FileReader("Menu.txt"));
                        while((line = fileHandler3.readLine()) != null){
                            char firstChar = line.charAt(0);
                            if(firstChar == 'B'){
                                count += 1;
                            }                        
                        }
                        foodID = String.format("B%d", count);
                }
                newFoodDetail = String.format("%s:%s:%.2f:%s\n", foodID, foodName, foodPrice, foodState);
                FileWriter newFile = new FileWriter("Menu.txt",true);
                newFile.write(newFoodDetail);
                newFile.close();
                JOptionPane.showMessageDialog(null, "New item added");
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Unable read file!");
        }
    }
    
    public void updateFoodAndBeverage(){
        try{
            BufferedReader fileHandler1 = new BufferedReader(new FileReader("Menu.txt"));
            String line;
            String databuffer = "";
            boolean found = false;
            
            while((line = fileHandler1.readLine()) != null){
                String[] lineBuffer = line.split(":");
                if(foodName.equals(lineBuffer[1])){
                    databuffer += String.format("%s:%s:%.2f:%s\n", lineBuffer[0], foodName, foodPrice, foodState);
                    found = true;
                }
                else{
                    databuffer += line + "\n";
                }
            }
            if(!found){
                JOptionPane.showMessageDialog(null, "The item does not exist!");
            }
            fileHandler1.close();
            
            BufferedWriter fileHandler2 = new BufferedWriter(new FileWriter("Menu.txt"));
            fileHandler2.write(databuffer);
            fileHandler2.close();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Unable read file!");
        }
    }
}
