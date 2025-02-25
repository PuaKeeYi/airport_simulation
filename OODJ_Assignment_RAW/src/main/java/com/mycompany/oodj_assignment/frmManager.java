
package com.mycompany.oodj_assignment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmManager extends javax.swing.JFrame {
    String managerID;
    
    // constructor with getting Manager ID when manager frame is opened
    public frmManager(String MID) {
        managerID = MID;
        initComponents();
        //get the details of the particular manager from the method getUserDetails
        Manager thisManager = new Manager(managerID);
        String[] managerDetails = thisManager.getUserDetails(managerID);
        thisManager.setUserPassword(managerDetails[1]);
        thisManager.setManagerName(managerDetails[2]);
        thisManager.setManagerPhoneNumber(managerDetails[4]);
        
        labelManagerID.setText(MID);
        labelManagerName.setText(thisManager.getManagerName());
        labelPhoneNumber.setText(thisManager.getManagerPhoneNumber());
     
    }

    // normal constructor
    public frmManager() {
        initComponents();
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        clickToRegistrationSite = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        clickToViewManagerMenu = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        clickToViewManagerOrder = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        clickToViewFeedback = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        clickToChangePassword = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        clickToReport = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        clickToViewLoggingActivity = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        managerHomePage = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        clickToLogout = new javax.swing.JLabel();
        labelManagerID = new javax.swing.JLabel();
        labelManagerName = new javax.swing.JLabel();
        labelPhoneNumber = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        registrationSite = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registerInput1 = new javax.swing.JTextField();
        registerInput2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        registerSelect1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        registerInput3 = new javax.swing.JTextField();
        updateMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        addNewFood = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        menuInput1 = new javax.swing.JTextField();
        menuInput2 = new javax.swing.JTextField();
        menuSelect1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        menuSelect2 = new javax.swing.JComboBox<>();
        updateFABDetail = new javax.swing.JButton();
        viewOrder = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderListTable = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        clickToViewPending = new javax.swing.JButton();
        clickToViewPaid = new javax.swing.JButton();
        clickToViewAllOrder = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        orderIDInput = new javax.swing.JTextField();
        clickToUpdateToPending = new javax.swing.JButton();
        clickToUpdateToPaid = new javax.swing.JButton();
        viewFeedback = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        feedbackTable = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        changePassword = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        updateInput1 = new javax.swing.JTextField();
        updateInput2 = new javax.swing.JTextField();
        changePasswordButton = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        starRateTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        totalUserTable = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        totalOrderAndIncomeTable = new javax.swing.JTable();
        loggingActivity = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        loggingActivityTable = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("WELCOME TO MANAGER SITE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        clickToRegistrationSite.setBackground(new java.awt.Color(204, 204, 204));
        clickToRegistrationSite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToRegistrationSite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToRegistrationSite.setText("Registration Site");
        clickToRegistrationSite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToRegistrationSiteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToRegistrationSite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToRegistrationSite, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        clickToViewManagerMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToViewManagerMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToViewManagerMenu.setText("Update Menu");
        clickToViewManagerMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToViewManagerMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToViewManagerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clickToViewManagerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        clickToViewManagerOrder.setBackground(new java.awt.Color(255, 255, 255));
        clickToViewManagerOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToViewManagerOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToViewManagerOrder.setText("View Order");
        clickToViewManagerOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToViewManagerOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToViewManagerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToViewManagerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        clickToViewFeedback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToViewFeedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToViewFeedback.setText("View Feedback");
        clickToViewFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToViewFeedbackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToViewFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToViewFeedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        clickToChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToChangePassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToChangePassword.setText("Change Password");
        clickToChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToChangePasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToChangePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToChangePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.setForeground(new java.awt.Color(204, 204, 204));

        clickToReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToReport.setText("Report");
        clickToReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        clickToViewLoggingActivity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clickToViewLoggingActivity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickToViewLoggingActivity.setText("View Logging Activity");
        clickToViewLoggingActivity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToViewLoggingActivityMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToViewLoggingActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickToViewLoggingActivity, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 410));

        jLabel17.setFont(new java.awt.Font("Sitka Subheading", 1, 36)); // NOI18N
        jLabel17.setText("Manager Home Page");

        clickToLogout.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        clickToLogout.setText("LOGOUT");
        clickToLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToLogoutMouseClicked(evt);
            }
        });

        labelManagerID.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        labelManagerID.setText("jLabel19");

        labelManagerName.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        labelManagerName.setText("jLabel20");

        labelPhoneNumber.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        labelPhoneNumber.setText("jLabel23");

        jLabel19.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel19.setText("Manager ID           :");

        jLabel20.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel20.setText("Name                      :");

        jLabel23.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel23.setText("Phone Number    :");

        jLabel24.setFont(new java.awt.Font("STXinwei", 0, 24)); // NOI18N
        jLabel24.setText("Personal Details");

        javax.swing.GroupLayout managerHomePageLayout = new javax.swing.GroupLayout(managerHomePage);
        managerHomePage.setLayout(managerHomePageLayout);
        managerHomePageLayout.setHorizontalGroup(
            managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerHomePageLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerHomePageLayout.createSequentialGroup()
                        .addGroup(managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(managerHomePageLayout.createSequentialGroup()
                                .addGroup(managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(labelManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelManagerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(managerHomePageLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(clickToLogout)
                        .addGap(22, 22, 22))))
        );
        managerHomePageLayout.setVerticalGroup(
            managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerHomePageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickToLogout))
                .addGap(53, 53, 53)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelManagerID)
                    .addComponent(jLabel19))
                .addGap(31, 31, 31)
                .addGroup(managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelManagerName)
                    .addComponent(jLabel20))
                .addGap(34, 34, 34)
                .addGroup(managerHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhoneNumber)
                    .addComponent(jLabel23))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", managerHomePage);

        jLabel1.setFont(new java.awt.Font("STXinwei", 1, 26)); // NOI18N
        jLabel1.setText("NEW USER REGISTRATION");

        jLabel2.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel2.setText("RETURN");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        jLabel3.setText("New User Name   :");

        jLabel4.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        jLabel4.setText("Password               :");

        jLabel5.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        jLabel5.setText("Role                       :");

        registerInput1.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        registerInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerInput1ActionPerformed(evt);
            }
        });

        registerInput2.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        registerInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerInput2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        registerSelect1.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        registerSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "customer", "manager" }));
        registerSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSelect1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        jLabel7.setText("Phone Number      :");

        registerInput3.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        registerInput3.setToolTipText("");

        javax.swing.GroupLayout registrationSiteLayout = new javax.swing.GroupLayout(registrationSite);
        registrationSite.setLayout(registrationSiteLayout);
        registrationSiteLayout.setHorizontalGroup(
            registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationSiteLayout.createSequentialGroup()
                .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrationSiteLayout.createSequentialGroup()
                        .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registrationSiteLayout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registrationSiteLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(registrationSiteLayout.createSequentialGroup()
                                        .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(registerInput1)
                                            .addComponent(registerInput2)
                                            .addComponent(registerSelect1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(registerInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationSiteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        registrationSiteLayout.setVerticalGroup(
            registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationSiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registrationSiteLayout.createSequentialGroup()
                        .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrationSiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(registerInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("tab2", registrationSite);

        menuTable.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(menuTable);

        jLabel9.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel9.setText("RETURN");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        addNewFood.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        addNewFood.setText("Add New");
        addNewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewFoodActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        jLabel10.setText("Food Name  :");

        jLabel11.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        jLabel11.setText("Price              :");

        jLabel12.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        jLabel12.setText(" ");

        jLabel13.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        jLabel13.setText("Status            :");

        menuInput1.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N

        menuInput2.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N

        menuSelect1.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        menuSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "not available" }));

        jLabel14.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        jLabel14.setText("Food type      :");

        menuSelect2.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        menuSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "food", "beverage" }));

        updateFABDetail.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        updateFABDetail.setText("Update");
        updateFABDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFABDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateMenuLayout = new javax.swing.GroupLayout(updateMenu);
        updateMenu.setLayout(updateMenuLayout);
        updateMenuLayout.setHorizontalGroup(
            updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(updateMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addNewFood, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(updateFABDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuSelect1, 0, 120, Short.MAX_VALUE)
                    .addComponent(menuInput2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuInput1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(menuSelect2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addContainerGap())))
        );
        updateMenuLayout.setVerticalGroup(
            updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateMenuLayout.createSequentialGroup()
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateMenuLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(menuInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNewFood)))
                    .addGroup(updateMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(menuInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateFABDetail))
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateMenuLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel12))
                    .addGroup(updateMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(menuSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(menuSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("tab3", updateMenu);

        orderListTable.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        orderListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer ID", "Item List", "Total Price", "Status", "Order Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderListTable);
        if (orderListTable.getColumnModel().getColumnCount() > 0) {
            orderListTable.getColumnModel().getColumn(0).setMinWidth(75);
            orderListTable.getColumnModel().getColumn(0).setMaxWidth(75);
            orderListTable.getColumnModel().getColumn(1).setMinWidth(80);
            orderListTable.getColumnModel().getColumn(1).setMaxWidth(80);
            orderListTable.getColumnModel().getColumn(3).setMinWidth(75);
            orderListTable.getColumnModel().getColumn(3).setMaxWidth(75);
            orderListTable.getColumnModel().getColumn(4).setMinWidth(77);
            orderListTable.getColumnModel().getColumn(4).setMaxWidth(77);
            orderListTable.getColumnModel().getColumn(5).setMinWidth(80);
            orderListTable.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jLabel21.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel21.setText("RETURN");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        clickToViewPending.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        clickToViewPending.setText("View Pending Order");
        clickToViewPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToViewPendingActionPerformed(evt);
            }
        });

        clickToViewPaid.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        clickToViewPaid.setText("View Paid Order");
        clickToViewPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToViewPaidActionPerformed(evt);
            }
        });

        clickToViewAllOrder.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        clickToViewAllOrder.setText("View All Order");
        clickToViewAllOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToViewAllOrderActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        jLabel18.setText("Order ID   :");

        clickToUpdateToPending.setText("Update to Pending");
        clickToUpdateToPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToUpdateToPendingActionPerformed(evt);
            }
        });

        clickToUpdateToPaid.setText("Update to Paid");
        clickToUpdateToPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToUpdateToPaidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewOrderLayout = new javax.swing.GroupLayout(viewOrder);
        viewOrder.setLayout(viewOrderLayout);
        viewOrderLayout.setHorizontalGroup(
            viewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(viewOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewOrderLayout.createSequentialGroup()
                        .addComponent(clickToViewAllOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clickToViewPending)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clickToViewPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addGroup(viewOrderLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clickToUpdateToPending)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clickToUpdateToPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewOrderLayout.setVerticalGroup(
            viewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(viewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clickToViewAllOrder)
                        .addComponent(clickToViewPending)
                        .addComponent(clickToViewPaid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(viewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(orderIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickToUpdateToPending)
                    .addComponent(clickToUpdateToPaid))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab4", viewOrder);

        feedbackTable.setFont(new java.awt.Font("STXinwei", 0, 12)); // NOI18N
        feedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer ID", "Rate", "Feedback", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(feedbackTable);
        if (feedbackTable.getColumnModel().getColumnCount() > 0) {
            feedbackTable.getColumnModel().getColumn(0).setMinWidth(100);
            feedbackTable.getColumnModel().getColumn(0).setMaxWidth(100);
            feedbackTable.getColumnModel().getColumn(1).setMinWidth(80);
            feedbackTable.getColumnModel().getColumn(1).setMaxWidth(80);
            feedbackTable.getColumnModel().getColumn(3).setMinWidth(80);
            feedbackTable.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jLabel22.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel22.setText("RETURN");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewFeedbackLayout = new javax.swing.GroupLayout(viewFeedback);
        viewFeedback.setLayout(viewFeedbackLayout);
        viewFeedbackLayout.setHorizontalGroup(
            viewFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewFeedbackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );
        viewFeedbackLayout.setVerticalGroup(
            viewFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab5", viewFeedback);

        jLabel6.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel6.setText("RETURN");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel8.setText("Old Password            :");

        jLabel15.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jLabel15.setText("New Password           :");

        updateInput1.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N

        updateInput2.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N

        changePasswordButton.setFont(new java.awt.Font("STXinwei", 0, 15)); // NOI18N
        changePasswordButton.setText("Update");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changePasswordLayout = new javax.swing.GroupLayout(changePassword);
        changePassword.setLayout(changePasswordLayout);
        changePasswordLayout.setHorizontalGroup(
            changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordLayout.createSequentialGroup()
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changePasswordLayout.createSequentialGroup()
                        .addContainerGap(516, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(changePasswordLayout.createSequentialGroup()
                        .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(changePasswordLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(changePasswordLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(28, 28, 28)
                                        .addComponent(updateInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(changePasswordLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(25, 25, 25)
                                        .addComponent(updateInput2))))
                            .addGroup(changePasswordLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        changePasswordLayout.setVerticalGroup(
            changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(102, 102, 102)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(updateInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(updateInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", changePassword);

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        starRateTable.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        starRateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"5 Star", ""},
                {"4 Star", null},
                {"3 Star", null},
                {"2 Star", null},
                {"1 Star", null}
            },
            new String [] {
                "Rate", "Total Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        starRateTable.setRowHeight(30);
        jScrollPane4.setViewportView(starRateTable);

        jTabbedPane2.addTab("Count of Rating", jScrollPane4);

        totalUserTable.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        totalUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total User", null},
                {"Total Customer", null},
                {"Total Manager", null}
            },
            new String [] {
                "", "Total Count"
            }
        ));
        totalUserTable.setRowHeight(40);
        jScrollPane5.setViewportView(totalUserTable);

        jTabbedPane2.addTab("Total User", jScrollPane5);

        totalOrderAndIncomeTable.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        totalOrderAndIncomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total Order", null},
                {"Total Income", null}
            },
            new String [] {
                "", "Total Count"
            }
        ));
        totalOrderAndIncomeTable.setRowHeight(40);
        jScrollPane7.setViewportView(totalOrderAndIncomeTable);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Total Income and Order", jPanel12);

        jTabbedPane1.addTab("tab7", jTabbedPane2);

        loggingActivityTable.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        loggingActivityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "UserID", "Date and Time", "Time"
            }
        ));
        jScrollPane6.setViewportView(loggingActivityTable);

        jLabel26.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        jLabel26.setText("RETURN");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loggingActivityLayout = new javax.swing.GroupLayout(loggingActivity);
        loggingActivity.setLayout(loggingActivityLayout);
        loggingActivityLayout.setHorizontalGroup(
            loggingActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loggingActivityLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );
        loggingActivityLayout.setVerticalGroup(
            loggingActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loggingActivityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab8", loggingActivity);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 580, 440));

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

    // mouse click to registration site.
    private void clickToRegistrationSiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToRegistrationSiteMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_clickToRegistrationSiteMouseClicked

    // mouse click return from registration to home page.
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    //empty
    private void registerInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerInput1ActionPerformed

    // Registration for new user
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String registerName = registerInput1.getText();
        String registerPassword = registerInput2.getText();
        String registerRole = registerSelect1.getSelectedItem().toString();
        String registerPhoneNumber = registerInput3.getText();
        if(!Manager.userNameValidation(registerName)){
            JOptionPane.showMessageDialog(null,"Username within 1-20 char and atleast one upper case!");
        }
        else if(!Manager.passwordValidation(registerPassword)){
            JOptionPane.showMessageDialog(null,"Password must be at least one upper,lower and number!");
        }
        else if(!Manager.phoneNumberValidation(registerPhoneNumber)){
            JOptionPane.showMessageDialog(null,"Wrong phone number format!");
        }
        else{
            Manager.newUserRegistration(registerName, registerPassword, registerRole,registerPhoneNumber);
            registerInput1.setText("");
            registerInput2.setText("");
            registerInput3.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    //empty
    private void registerSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSelect1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerSelect1ActionPerformed

    //empty
    private void registerInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerInput2ActionPerformed

    
    
    
    
    // mouse click to Menu site.
    private void clickToViewManagerMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToViewManagerMenuMouseClicked
        menuTable.setAutoCreateRowSorter(true);
        jTabbedPane1.setSelectedIndex(2);
        DefaultTableModel menu = (DefaultTableModel) menuTable.getModel();
        Manager.openTable(menu,"Menu.txt",":");
        menu.setRowCount(0);
        Manager.openTable(menu,"Menu.txt",":");
    }//GEN-LAST:event_clickToViewManagerMenuMouseClicked

    // mouse click return from Menu to home page.
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    // add new food and beverage to the menu.
    private void addNewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewFoodActionPerformed
        String menuFoodName = menuInput1.getText();
        String menuFoodPrice = menuInput2.getText();
        double menuFoodPriceDouble = Double.parseDouble(menuFoodPrice);
        String menuStateSelect = menuSelect1.getSelectedItem().toString();
        String menuTypeSelect = menuSelect2.getSelectedItem().toString();
        
        FoodAndBeverage newFAB = new FoodAndBeverage(menuFoodName,menuFoodPriceDouble,menuStateSelect);
        newFAB.addFoodAndBeverage(menuTypeSelect);
        DefaultTableModel menu = (DefaultTableModel) menuTable.getModel();
        menu.setRowCount(0);
        Manager.openTable(menu,"Menu.txt",":");
    }//GEN-LAST:event_addNewFoodActionPerformed

    // button click to update selected food and beverage detail.
    private void updateFABDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFABDetailActionPerformed
        String menuFoodName = menuInput1.getText();
        String menuFoodPrice = menuInput2.getText();
        double menuFoodPriceDouble = Double.parseDouble(menuFoodPrice);
        String menuStateSelect = menuSelect1.getSelectedItem().toString();
        
        FoodAndBeverage newFAB = new FoodAndBeverage(menuFoodName,menuFoodPriceDouble,menuStateSelect);
        newFAB.updateFoodAndBeverage();
        DefaultTableModel menu = (DefaultTableModel) menuTable.getModel();
        menu.setRowCount(0);
        Manager.openTable(menu,"Menu.txt",":");
    }//GEN-LAST:event_updateFABDetailActionPerformed

    
    
    
    // mouse click to view order site
    private void clickToViewManagerOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToViewManagerOrderMouseClicked
        orderListTable.setAutoCreateRowSorter(true);
        jTabbedPane1.setSelectedIndex(3);
        DefaultTableModel orderTableModel = (DefaultTableModel) orderListTable.getModel();
        Manager.openTable(orderTableModel,"Order.txt","::");
        orderTableModel.setRowCount(0);
        Manager.openTable(orderTableModel,"Order.txt","::");
    }//GEN-LAST:event_clickToViewManagerOrderMouseClicked

    // mouse click to return from viewOrder site to home page.
    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel21MouseClicked

    
    
    
    
    // mouse click to view feedback site
    private void clickToViewFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToViewFeedbackMouseClicked
        feedbackTable.setAutoCreateRowSorter(true);
        jTabbedPane1.setSelectedIndex(4);
        DefaultTableModel FBTable = (DefaultTableModel) feedbackTable.getModel();
        Manager.openTable(FBTable,"feedback.txt",":");
        FBTable.setRowCount(0);
        Manager.openTable(FBTable,"feedback.txt",":");
    }//GEN-LAST:event_clickToViewFeedbackMouseClicked

    // mouse click to return from viewFeedback site to home page.
    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel22MouseClicked

    
    
    
    //mouse click to update personal detail site
    private void clickToChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToChangePasswordMouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_clickToChangePasswordMouseClicked

    //mouse click to return from update personal detail site to home page.
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    //update PERSONAL(CHANGE PASSWORD)
    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        String updateOldPassword = updateInput1.getText();
        String updateNewPaswword = updateInput2.getText();
        if(!Manager.passwordValidation(updateOldPassword)){
            JOptionPane.showMessageDialog(null,"Password must be at least one upper,lower and number!");
        }
        else if(!Manager.passwordValidation(updateNewPaswword)){
            JOptionPane.showMessageDialog(null,"Password must be at least one upper,lower and number!");
        }
        else{
            Manager.changePassword(managerID,updateOldPassword,updateNewPaswword);
            updateInput1.setText("");
            updateInput2.setText("");
        }
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    
    
    
    // LOGOUT button
    private void clickToLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToLogoutMouseClicked
        JFrame JloginPage = new frmLogin();
        JloginPage.setVisible(true);
        dispose();
        Manager.captureLoggingActivity(managerID, "LOGOUT");
    }//GEN-LAST:event_clickToLogoutMouseClicked

    
    
    
    // mouse click to view PENDING ORDER
    private void clickToViewPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToViewPendingActionPerformed
        DefaultTableModel orderTableModel = (DefaultTableModel) orderListTable.getModel();
        Manager.viewPendingOrPaidOrder(orderTableModel,"pending");
        orderTableModel.setRowCount(0);
        Manager.viewPendingOrPaidOrder(orderTableModel,"pending");
    }//GEN-LAST:event_clickToViewPendingActionPerformed
    // mouse click to view PAID ORDER
    private void clickToViewPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToViewPaidActionPerformed
        DefaultTableModel orderTableModel = (DefaultTableModel) orderListTable.getModel();
        Manager.viewPendingOrPaidOrder(orderTableModel,"paid");
        orderTableModel.setRowCount(0);
        Manager.viewPendingOrPaidOrder(orderTableModel,"paid");
    }//GEN-LAST:event_clickToViewPaidActionPerformed
    // mouse click to view ALL ORDER
    private void clickToViewAllOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToViewAllOrderActionPerformed
        DefaultTableModel orderTableModel = (DefaultTableModel) orderListTable.getModel();
        Manager.openTable(orderTableModel,"Order.txt","::");
        orderTableModel.setRowCount(0);
        Manager.openTable(orderTableModel,"Order.txt","::");
    }//GEN-LAST:event_clickToViewAllOrderActionPerformed
    // click to change PAID to PENDING
    private void clickToUpdateToPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToUpdateToPendingActionPerformed
        String orderID = orderIDInput.getText();
        if (!Manager.checkIfRepeated(orderID, "pending")){
            Manager.changeOrderStatus(orderID,"pending");
            DefaultTableModel orderTableModel = (DefaultTableModel) orderListTable.getModel();
            Manager.viewPendingOrPaidOrder(orderTableModel,"pending");
            orderTableModel.setRowCount(0);
            Manager.viewPendingOrPaidOrder(orderTableModel,"pending");
        }else{
            JOptionPane.showMessageDialog(null, "This order is already pending.");
        } 
    }//GEN-LAST:event_clickToUpdateToPendingActionPerformed
    // click to change PENDING to PAID
    private void clickToUpdateToPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToUpdateToPaidActionPerformed
        String orderID = orderIDInput.getText();
        if (!Manager.checkIfRepeated(orderID, "paid")){
            Manager.changeOrderStatus(orderID,"paid");
            DefaultTableModel orderTableModel = (DefaultTableModel) orderListTable.getModel();
            Manager.viewPendingOrPaidOrder(orderTableModel,"paid");
            orderTableModel.setRowCount(0);
            Manager.viewPendingOrPaidOrder(orderTableModel,"paid");
        }else{
            JOptionPane.showMessageDialog(null, "This order is already paid.");
        } 
    }//GEN-LAST:event_clickToUpdateToPaidActionPerformed

    
    
    
    //report site,show total star rating in table 
    //report site,show total user in table
    //report site,show total order and income in table
    private void clickToReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToReportMouseClicked
        //starRateTable
        jTabbedPane1.setSelectedIndex(6);
        DefaultTableModel starRateTableModel = (DefaultTableModel) starRateTable.getModel();
        int[] rateCount = Report.rateCountReport();
        for(int i = 0;i<rateCount.length;i++){
            starRateTableModel.setValueAt(rateCount[i], i, 1);
        }
        
        DefaultTableModel totalUserTableModel = (DefaultTableModel) totalUserTable.getModel();
        int[] userCount = Report.countTotalUserReport();
        for(int i = 0;i<userCount.length;i++){
            totalUserTableModel.setValueAt(userCount[i], i, 1);
        }
        
        DefaultTableModel totalOrderAndIncomeTableModel = (DefaultTableModel) totalOrderAndIncomeTable.getModel();
        double[] orderIncomeCount = Report.countTotalOrderIncomeReport();
        for(int i = 0;i<orderIncomeCount.length;i++){
            totalOrderAndIncomeTableModel.setValueAt(orderIncomeCount[i], i, 1);
        }
    }//GEN-LAST:event_clickToReportMouseClicked

    
    
    
    // click to view LOGGING ACTIVITY
    private void clickToViewLoggingActivityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToViewLoggingActivityMouseClicked
        jTabbedPane1.setSelectedIndex(7);
        DefaultTableModel loggingActivityModel = (DefaultTableModel) loggingActivityTable.getModel();
        loggingActivityModel.setRowCount(0);
        Manager.openTable(loggingActivityModel, "loggingActivity.txt", ";");
    }//GEN-LAST:event_clickToViewLoggingActivityMouseClicked
    // return from LOGGING ACTIVITY
    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel26MouseClicked

    
    //empty
    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewFood;
    private javax.swing.JPanel changePassword;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JLabel clickToChangePassword;
    private javax.swing.JLabel clickToLogout;
    private javax.swing.JLabel clickToRegistrationSite;
    private javax.swing.JLabel clickToReport;
    private javax.swing.JButton clickToUpdateToPaid;
    private javax.swing.JButton clickToUpdateToPending;
    private javax.swing.JButton clickToViewAllOrder;
    private javax.swing.JLabel clickToViewFeedback;
    private javax.swing.JLabel clickToViewLoggingActivity;
    private javax.swing.JLabel clickToViewManagerMenu;
    private javax.swing.JLabel clickToViewManagerOrder;
    private javax.swing.JButton clickToViewPaid;
    private javax.swing.JButton clickToViewPending;
    private javax.swing.JTable feedbackTable;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelManagerID;
    private javax.swing.JLabel labelManagerName;
    private javax.swing.JLabel labelPhoneNumber;
    private javax.swing.JPanel loggingActivity;
    private javax.swing.JTable loggingActivityTable;
    private javax.swing.JPanel managerHomePage;
    private javax.swing.JTextField menuInput1;
    private javax.swing.JTextField menuInput2;
    private javax.swing.JComboBox<String> menuSelect1;
    private javax.swing.JComboBox<String> menuSelect2;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField orderIDInput;
    private javax.swing.JTable orderListTable;
    private javax.swing.JTextField registerInput1;
    private javax.swing.JTextField registerInput2;
    private javax.swing.JTextField registerInput3;
    private javax.swing.JComboBox<String> registerSelect1;
    private javax.swing.JPanel registrationSite;
    private javax.swing.JTable starRateTable;
    private javax.swing.JTable totalOrderAndIncomeTable;
    private javax.swing.JTable totalUserTable;
    private javax.swing.JButton updateFABDetail;
    private javax.swing.JTextField updateInput1;
    private javax.swing.JTextField updateInput2;
    private javax.swing.JPanel updateMenu;
    private javax.swing.JPanel viewFeedback;
    private javax.swing.JPanel viewOrder;
    // End of variables declaration//GEN-END:variables
}
