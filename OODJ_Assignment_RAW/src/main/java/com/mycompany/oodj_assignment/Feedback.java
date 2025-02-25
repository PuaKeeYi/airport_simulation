
package com.mycompany.oodj_assignment;

import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Feedback {
    String customerID;
    String comment;
    String rate;
    String date;
    
    public Feedback(String CID,String RATE,String CT,String DATE){
        customerID = CID;
        comment = CT;
        rate = RATE;
        date = DATE;
    }

    public String getComment() {
        return comment;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getDate() {
        return date;
    }

    public String getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    public void addNewFeedback(){
        String newFeedback = String.format("%s:%s:%s:%s\n", customerID, rate, comment, date);
        try{
            FileWriter newFile = new FileWriter("feedback.txt",true);
            newFile.write(newFeedback);
            newFile.close();
            JOptionPane.showMessageDialog(null, "Feedback Saved! Thank you for your response!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
