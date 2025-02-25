
package com.mycompany.oodj_assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class frmCustomer extends javax.swing.JFrame {
    String customerID;
    
    public frmCustomer(String CID) {
        customerID = CID;
        initComponents();
        Customer thisCustomer = new Customer(customerID);
        String[] customerDetails = thisCustomer.getUserDetails(customerID);
        thisCustomer.setUserPassword(customerDetails[1]);
        thisCustomer.setCustomerName(customerDetails[2]);
        thisCustomer.setCustomerPhoneNumber(customerDetails[4]);
        
        labelCustomerID.setText(CID);
        labelCustomerName.setText(thisCustomer.getCustomerName());
        labelPhoneNumber.setText(thisCustomer.getCustomerPhoneNumber());
        feedbackSiteCusID.setText(CID);
    }

    public frmCustomer() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        clickToFunction1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        clickToFeedbackSite = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        customerHomePage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelCustomerID = new javax.swing.JLabel();
        labelCustomerName = new javax.swing.JLabel();
        labelPhoneNumber = new javax.swing.JLabel();
        customerOrderSite = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        makeOrderTable = new javax.swing.JTable();
        clickToComfirmOrder = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        makeFeedbackPage = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        feedbackSelect = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        feedbackComment = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        feedbackSiteCusID = new javax.swing.JLabel();
        saveCustomerFeedback = new javax.swing.JButton();
        viewOrderHistory = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        paidOrderTable = new javax.swing.JTable();
        clickToPayOrder = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pendingOrderTable = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        inputOrderID = new javax.swing.JTextField();
        cusChangePassword = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cusUpdateInput1 = new javax.swing.JTextField();
        cusUpdateInput2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel25.setText("jLabel25");

        jLabel27.setText("jLabel27");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME tO APU CAFETERIA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(170, 410));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        clickToFunction1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToFunction1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToFunction1.setText("Make Order");
        clickToFunction1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToFunction1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToFunction1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToFunction1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        clickToFeedbackSite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToFeedbackSite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToFeedbackSite.setText("Make Feedback");
        clickToFeedbackSite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToFeedbackSiteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToFeedbackSite, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToFeedbackSite, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("View and Pay Order");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Change Password");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 410));

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 36)); // NOI18N
        jLabel3.setText("Customer Home Page");

        jLabel4.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel4.setText("LOGOUT");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("STXinwei", 0, 24)); // NOI18N
        jLabel5.setText("Personal Details");

        jLabel6.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel6.setText("Customer ID      :");

        jLabel7.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel7.setText("Name                   :");

        jLabel8.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel8.setText("Phone Number  :");

        labelCustomerID.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        labelCustomerID.setText("labelCustomerID");

        labelCustomerName.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        labelCustomerName.setText("labelCustomerName");

        labelPhoneNumber.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        labelPhoneNumber.setText("labelPhoneNumber");

        javax.swing.GroupLayout customerHomePageLayout = new javax.swing.GroupLayout(customerHomePage);
        customerHomePage.setLayout(customerHomePageLayout);
        customerHomePageLayout.setHorizontalGroup(
            customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerHomePageLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerHomePageLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24))
                    .addGroup(customerHomePageLayout.createSequentialGroup()
                        .addGroup(customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(customerHomePageLayout.createSequentialGroup()
                                .addGroup(customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(labelCustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        customerHomePageLayout.setVerticalGroup(
            customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerHomePageLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustomerID))
                .addGap(26, 26, 26)
                .addGroup(customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelCustomerName))
                .addGap(40, 40, 40)
                .addGroup(customerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelPhoneNumber))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab1", customerHomePage);

        jLabel9.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel9.setText("RETURN");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        makeOrderTable.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        makeOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FoodID", "Food Name", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(makeOrderTable);

        clickToComfirmOrder.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        clickToComfirmOrder.setText("Confirm Order");
        clickToComfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToComfirmOrderActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        jLabel14.setText("Make your order by type in your quatities and them comfirm the selection.");

        javax.swing.GroupLayout customerOrderSiteLayout = new javax.swing.GroupLayout(customerOrderSite);
        customerOrderSite.setLayout(customerOrderSiteLayout);
        customerOrderSiteLayout.setHorizontalGroup(
            customerOrderSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(customerOrderSiteLayout.createSequentialGroup()
                .addGroup(customerOrderSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerOrderSiteLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(clickToComfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(customerOrderSiteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );
        customerOrderSiteLayout.setVerticalGroup(
            customerOrderSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderSiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerOrderSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(customerOrderSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clickToComfirmOrder, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("tab2", customerOrderSite);

        jLabel10.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel10.setText("RETURN");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel12.setText("Rating                :");

        feedbackSelect.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        feedbackSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Star", "2 Stars", "3 Stars", "4 Stars", "5 Stars" }));

        jLabel15.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel15.setText("Comment         :");

        feedbackComment.setColumns(20);
        feedbackComment.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        feedbackComment.setRows(5);
        jScrollPane3.setViewportView(feedbackComment);

        jLabel16.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        jLabel16.setText("Please help to rate and give feedback for our system and food.");

        jLabel17.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        jLabel17.setText("This help us to build a better system! Thank you!");

        jLabel18.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel18.setText("ID                        :");

        feedbackSiteCusID.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        feedbackSiteCusID.setText("CustomerID");

        saveCustomerFeedback.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        saveCustomerFeedback.setText("Save");
        saveCustomerFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCustomerFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout makeFeedbackPageLayout = new javax.swing.GroupLayout(makeFeedbackPage);
        makeFeedbackPage.setLayout(makeFeedbackPageLayout);
        makeFeedbackPageLayout.setHorizontalGroup(
            makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(makeFeedbackPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(makeFeedbackPageLayout.createSequentialGroup()
                        .addGroup(makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(makeFeedbackPageLayout.createSequentialGroup()
                        .addGroup(makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(feedbackSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(feedbackSiteCusID, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(makeFeedbackPageLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveCustomerFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        makeFeedbackPageLayout.setVerticalGroup(
            makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(makeFeedbackPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(33, 33, 33)
                .addGroup(makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(feedbackSiteCusID))
                .addGap(18, 18, 18)
                .addGroup(makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(feedbackSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(makeFeedbackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(saveCustomerFeedback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("tab3", makeFeedbackPage);

        jLabel11.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel11.setText("RETURN");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        paidOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "CustomerID", "Items", "Total Price", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(paidOrderTable);
        if (paidOrderTable.getColumnModel().getColumnCount() > 0) {
            paidOrderTable.getColumnModel().getColumn(0).setMinWidth(75);
            paidOrderTable.getColumnModel().getColumn(0).setMaxWidth(75);
            paidOrderTable.getColumnModel().getColumn(1).setMinWidth(80);
            paidOrderTable.getColumnModel().getColumn(1).setMaxWidth(80);
            paidOrderTable.getColumnModel().getColumn(3).setMinWidth(75);
            paidOrderTable.getColumnModel().getColumn(3).setMaxWidth(75);
            paidOrderTable.getColumnModel().getColumn(4).setMinWidth(77);
            paidOrderTable.getColumnModel().getColumn(4).setMaxWidth(77);
            paidOrderTable.getColumnModel().getColumn(5).setMinWidth(80);
            paidOrderTable.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        clickToPayOrder.setText("Pay Selected Pending Order");
        clickToPayOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToPayOrderActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        jLabel23.setText("Paid Order           :");

        jLabel24.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        jLabel24.setText("Pending Order      :");

        pendingOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "CustomerID", "Items", "Total Price", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(pendingOrderTable);
        if (pendingOrderTable.getColumnModel().getColumnCount() > 0) {
            pendingOrderTable.getColumnModel().getColumn(0).setMinWidth(75);
            pendingOrderTable.getColumnModel().getColumn(0).setMaxWidth(75);
            pendingOrderTable.getColumnModel().getColumn(1).setMinWidth(80);
            pendingOrderTable.getColumnModel().getColumn(1).setMaxWidth(80);
            pendingOrderTable.getColumnModel().getColumn(3).setMinWidth(75);
            pendingOrderTable.getColumnModel().getColumn(3).setMaxWidth(75);
            pendingOrderTable.getColumnModel().getColumn(4).setMinWidth(77);
            pendingOrderTable.getColumnModel().getColumn(4).setMaxWidth(77);
            pendingOrderTable.getColumnModel().getColumn(5).setMinWidth(80);
            pendingOrderTable.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jLabel26.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        jLabel26.setText("Order ID  :");

        javax.swing.GroupLayout viewOrderHistoryLayout = new javax.swing.GroupLayout(viewOrderHistory);
        viewOrderHistory.setLayout(viewOrderHistoryLayout);
        viewOrderHistoryLayout.setHorizontalGroup(
            viewOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(viewOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewOrderHistoryLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewOrderHistoryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(clickToPayOrder))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewOrderHistoryLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );
        viewOrderHistoryLayout.setVerticalGroup(
            viewOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewOrderHistoryLayout.createSequentialGroup()
                .addGroup(viewOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewOrderHistoryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewOrderHistoryLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickToPayOrder)
                    .addComponent(jLabel26)
                    .addComponent(inputOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );

        jTabbedPane2.addTab("tab4", viewOrderHistory);

        jLabel20.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel20.setText("RETURN");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel21.setText("Old Password            :");

        jLabel22.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel22.setText("New Password           :");

        cusUpdateInput1.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N

        cusUpdateInput2.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cusChangePasswordLayout = new javax.swing.GroupLayout(cusChangePassword);
        cusChangePassword.setLayout(cusChangePasswordLayout);
        cusChangePasswordLayout.setHorizontalGroup(
            cusChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cusChangePasswordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
            .addGroup(cusChangePasswordLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(cusChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cusChangePasswordLayout.createSequentialGroup()
                        .addGroup(cusChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(cusChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cusUpdateInput1)
                            .addComponent(cusUpdateInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cusChangePasswordLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        cusChangePasswordLayout.setVerticalGroup(
            cusChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cusChangePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(92, 92, 92)
                .addGroup(cusChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cusUpdateInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(cusChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cusUpdateInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab5", cusChangePassword);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 580, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // LOGOUT button
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JFrame JloginPage = new frmLogin();
        JloginPage.setVisible(true);
        dispose();
        Customer.captureLoggingActivity(customerID, "LOGOUT");
    }//GEN-LAST:event_jLabel4MouseClicked

    
    
    // to Jtab2 page 1(Make Order Site)
    private void clickToFunction1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToFunction1MouseClicked
        jTabbedPane2.setSelectedIndex(1);
        DefaultTableModel makeOrderModel = (DefaultTableModel) makeOrderTable.getModel();
        makeOrderModel.setRowCount(0);
        Customer.openTable(makeOrderModel);
    }//GEN-LAST:event_clickToFunction1MouseClicked
    // return from Jtab2 page 1 
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel9MouseClicked
    // comfirm order button
    private void clickToComfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToComfirmOrderActionPerformed
        DefaultTableModel makeOrderModel = (DefaultTableModel) makeOrderTable.getModel();
        String[] itemCart = new String[0];
        String amount;
        double totalPrice = 0;
        for(int i=0;i<makeOrderModel.getRowCount();i++){
            amount = makeOrderModel.getValueAt(i,3).toString();
            if(Integer.parseInt(amount)>0){
                String foodID = (String)makeOrderModel.getValueAt(i, 0);
                String foodName = (String)makeOrderModel.getValueAt(i, 1);
                String foodPrice = (String)makeOrderModel.getValueAt(i, 2);
                itemCart = Array.appendStrings(itemCart, String.format("%s;%s;%s;%s", foodID, foodName, foodPrice, amount));
                totalPrice += Double.parseDouble(foodPrice) * Double.parseDouble(amount);
            } 
        }
        JFrame JFconfirmOrder = new frmConfirmOrder(itemCart, customerID, totalPrice);
        JFconfirmOrder.setVisible(true);
    }//GEN-LAST:event_clickToComfirmOrderActionPerformed
    // refresh button
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        DefaultTableModel makeOrderModel = (DefaultTableModel) makeOrderTable.getModel();
        makeOrderModel.setRowCount(0);
        Customer.openTable(makeOrderModel);
    }//GEN-LAST:event_refreshButtonActionPerformed

    
    
    // to Jtab2 page 2(Feedback Site)
    private void clickToFeedbackSiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToFeedbackSiteMouseClicked
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_clickToFeedbackSiteMouseClicked
    // return from Jtab2 page 2 
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel10MouseClicked
    //save customer feedback
    private void saveCustomerFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCustomerFeedbackActionPerformed
        String customerStarRating = feedbackSelect.getSelectedItem().toString();
        String customerComment = feedbackComment.getText();
        String date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        Feedback newFB = new Feedback(customerID, customerStarRating, customerComment, date);
        newFB.addNewFeedback();
        feedbackComment.setText("");
    }//GEN-LAST:event_saveCustomerFeedbackActionPerformed

    
    
    
    // to Jtab2 page 4(Change Password Site)
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jTabbedPane2.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel19MouseClicked
    // return from Jtab2 page 4 
    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel20MouseClicked
    // click to change password
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String updatecusOldPassword = cusUpdateInput1.getText();
        String updatecusNewPaswword = cusUpdateInput2.getText();
        if(!Customer.passwordValidation(updatecusOldPassword)){
            JOptionPane.showMessageDialog(null,"Password must be at least one upper,lower and number!");
        }
        else if(!Customer.passwordValidation(updatecusNewPaswword)){
            JOptionPane.showMessageDialog(null,"Password must be at least one upper,lower and number!");
        }
        else{
            Customer.changePassword(customerID,updatecusOldPassword,updatecusNewPaswword);
            cusUpdateInput1.setText("");
            cusUpdateInput2.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    // to Jtab2 page 3(View History Site)
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jTabbedPane2.setSelectedIndex(3);
        DefaultTableModel paidOrderModel = (DefaultTableModel) paidOrderTable.getModel();
        paidOrderModel.setRowCount(0);
        Customer.viewCustomerPersonalOrder(paidOrderModel, customerID, "paid");
        DefaultTableModel pendingOrderModel = (DefaultTableModel) pendingOrderTable.getModel();
        pendingOrderModel.setRowCount(0);
        Customer.viewCustomerPersonalOrder(pendingOrderModel, customerID, "pending");
    }//GEN-LAST:event_jLabel13MouseClicked
    // return from Jtab2 page 3 
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel11MouseClicked
    // pay pending order 
    private void clickToPayOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToPayOrderActionPerformed
        String getOrderID = inputOrderID.getText();
        Customer.paidOrder(getOrderID, customerID);
        DefaultTableModel paidOrderModel = (DefaultTableModel) paidOrderTable.getModel();
        paidOrderModel.setRowCount(0);
        Customer.viewCustomerPersonalOrder(paidOrderModel, customerID, "paid");
        DefaultTableModel pendingOrderModel = (DefaultTableModel) pendingOrderTable.getModel();
        pendingOrderModel.setRowCount(0);
        Customer.viewCustomerPersonalOrder(pendingOrderModel, customerID, "pending");
        inputOrderID.setText("");
    }//GEN-LAST:event_clickToPayOrderActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clickToComfirmOrder;
    private javax.swing.JLabel clickToFeedbackSite;
    private javax.swing.JLabel clickToFunction1;
    private javax.swing.JButton clickToPayOrder;
    private javax.swing.JPanel cusChangePassword;
    private javax.swing.JTextField cusUpdateInput1;
    private javax.swing.JTextField cusUpdateInput2;
    private javax.swing.JPanel customerHomePage;
    private javax.swing.JPanel customerOrderSite;
    private javax.swing.JTextArea feedbackComment;
    private javax.swing.JComboBox<String> feedbackSelect;
    private javax.swing.JLabel feedbackSiteCusID;
    private javax.swing.JTextField inputOrderID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel labelCustomerID;
    private javax.swing.JLabel labelCustomerName;
    private javax.swing.JLabel labelPhoneNumber;
    private javax.swing.JPanel makeFeedbackPage;
    private javax.swing.JTable makeOrderTable;
    private javax.swing.JTable paidOrderTable;
    private javax.swing.JTable pendingOrderTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveCustomerFeedback;
    private javax.swing.JPanel viewOrderHistory;
    // End of variables declaration//GEN-END:variables
}
