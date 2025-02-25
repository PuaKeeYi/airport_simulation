
package com.mycompany.oodj_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Report {
    // count the total star rating in feedback.txt
    public static int[] rateCountReport(){
        //starRateTable
        int[] countingStar ={0,0,0,0,0};
        String[] lineBuffer;
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("feedback.txt"));
            String line;
            
            while((line = fileHandler.readLine()) != null){
                lineBuffer = line.split(":");
                switch(lineBuffer[1]){
                    case "1 Star":
                        countingStar[4] += 1;
                        break;
                    case "2 Stars":
                        countingStar[3] += 1;
                        break;
                    case "3 Stars":
                        countingStar[2] += 1;
                        break;
                    case "4 Stars":
                        countingStar[1] += 1;
                        break;
                    case "5 Stars":
                        countingStar[0] += 1;
                        break;
                    default:
                        break;
                }
            }
            fileHandler.close();
            return countingStar;
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            return countingStar;
        }
    }
    // count total user, customer and manager from userCetails.txt
    public static int[] countTotalUserReport(){
        //totalUserTable
        int[] countingUser ={0,0,0};
        String[] lineBuffer;
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("userDetails.txt"));
            String line;
            
            while((line = fileHandler.readLine()) != null){
                countingUser[0]+=1;
                lineBuffer = line.split(" ");
                switch(lineBuffer[3]){
                    case "customer":
                        countingUser[1]+=1;
                        break;
                    case "manager":
                        countingUser[2]+=1;
                        break;
                    default:
                        break;
                }
            }
            fileHandler.close();
            return countingUser;
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            return countingUser;
        }
    }
    // count total income and order from Order.txt
    public static double[] countTotalOrderIncomeReport(){
        //totalOrderAndIncomeTable
        double[] countingOrderAndIncome ={0,0};
        String[] lineBuffer;
        double totalPrice = 0;
        try{
            BufferedReader fileHandler = new BufferedReader(new FileReader("Order.txt"));
            String line;
            
            while((line = fileHandler.readLine()) != null){
                countingOrderAndIncome[0]+=1;
                lineBuffer = line.split("::");
                countingOrderAndIncome[1] += Double.parseDouble(lineBuffer[3]);
            }
            fileHandler.close();
            return countingOrderAndIncome;
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            return countingOrderAndIncome;
        }
    }
    
}
