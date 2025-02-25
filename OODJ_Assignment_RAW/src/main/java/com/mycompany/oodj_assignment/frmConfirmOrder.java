
package com.mycompany.oodj_assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmConfirmOrder extends javax.swing.JFrame {
    //table checkConfirmOrder
    String customerID;
    String[] orderBuffer; 
    String orderStatus;
    double totalPrice;
    String date;
    
    // class created for catching value from frmCustomer
    public frmConfirmOrder(String[] buffer, String CUI, double TP){
        initComponents();
        customerID = CUI;
        orderBuffer = buffer;
        totalPrice = TP;
        date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        
        DefaultTableModel confirmOrderModel = (DefaultTableModel) checkConfirmOrder.getModel();
        confirmOrderModel.setRowCount(0);
        Object[] items = buffer;
        for(Object itemObject : items) {
            String currentLine = itemObject.toString().trim();
            String[] row = currentLine.split(";");
            confirmOrderModel.addRow(row);
        }
        totalPriceLabel.setText(String.valueOf(totalPrice));
    }
    
    public frmConfirmOrder() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkConfirmOrder = new javax.swing.JTable();
        clickToPayNow = new javax.swing.JButton();
        clickToPayLater = new javax.swing.JButton();
        clickToDiscardOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkConfirmOrder.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        checkConfirmOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Food Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(checkConfirmOrder);

        clickToPayNow.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        clickToPayNow.setText("Pay Now");
        clickToPayNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToPayNowActionPerformed(evt);
            }
        });

        clickToPayLater.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        clickToPayLater.setText("Pay Later");
        clickToPayLater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToPayLaterActionPerformed(evt);
            }
        });

        clickToDiscardOrder.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        clickToDiscardOrder.setText("Discard");
        clickToDiscardOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToDiscardOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        jLabel2.setText("Check Your Order");

        jLabel3.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        jLabel3.setText("Total Price  :");

        totalPriceLabel.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clickToPayNow, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clickToPayLater, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clickToDiscardOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickToDiscardOrder)
                    .addComponent(clickToPayLater)
                    .addComponent(clickToPayNow))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // click to pay and save paid order
    private void clickToPayNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToPayNowActionPerformed
        JOptionPane.showMessageDialog(null, "Order Paid!");
        orderStatus = "paid";
        Order.generateOrderID();
        String orderBuffer2 = String.join(",", orderBuffer);
        String newOrderDetail = String.format("%s::%s::%s::%.2f::%s::%s\n", Order.generateOrderID(),customerID,orderBuffer2,totalPrice,orderStatus,date);
        Order.makeNewOrder(newOrderDetail);
        dispose();
    }//GEN-LAST:event_clickToPayNowActionPerformed
    // click to pending and save pending order
    private void clickToPayLaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToPayLaterActionPerformed
        JOptionPane.showMessageDialog(null, "Order saved as pending, please pay afterward!");
        orderStatus = "pending";
        Order.generateOrderID();
        String orderBuffer2 = String.join(",", orderBuffer);
        String newOrderDetail = String.format("%s::%s::%s::%.2f::%s::%s\n", Order.generateOrderID(),customerID,orderBuffer2,totalPrice,orderStatus,date);
        Order.makeNewOrder(newOrderDetail);
        dispose();
    }//GEN-LAST:event_clickToPayLaterActionPerformed
    // click to exit this frame
    private void clickToDiscardOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToDiscardOrderActionPerformed
        dispose();
    }//GEN-LAST:event_clickToDiscardOrderActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable checkConfirmOrder;
    private javax.swing.JButton clickToDiscardOrder;
    private javax.swing.JButton clickToPayLater;
    private javax.swing.JButton clickToPayNow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
