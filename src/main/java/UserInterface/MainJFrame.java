/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AddressInfo;
import Business.BankingCheckingInfo;
import Business.BankingInfo;
import Business.BankingSavingsInfo;
import Business.DemoInfo;
import Business.DriverInfo;
import Business.MedicalInfo;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author kisan
 */
public class MainJFrame extends javax.swing.JFrame {
    DemoInfo demoInfo;
    AddressInfo addressInfo;
    BankingInfo bankingInfo;
    DriverInfo driverInfo;
    MedicalInfo medicalInfo;
    BankingCheckingInfo bankingCheckingInfo;
    BankingSavingsInfo bankingSavingsInfo;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        demoInfo = new DemoInfo();
        addressInfo = new AddressInfo();
        bankingInfo = new BankingInfo();
        driverInfo = new DriverInfo();
        medicalInfo = new MedicalInfo();
        bankingCheckingInfo = new BankingCheckingInfo();
        bankingSavingsInfo = new BankingSavingsInfo();
        displayWelcome();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jp1 = new javax.swing.JPanel();
        btnPersonalInfo = new javax.swing.JButton();
        btnAddress = new javax.swing.JButton();
        btnBanking = new javax.swing.JButton();
        btnDriving = new javax.swing.JButton();
        btnMedical = new javax.swing.JButton();
        btnViewReport = new javax.swing.JButton();
        btnViewAdd = new javax.swing.JButton();
        btnViewMed = new javax.swing.JButton();
        btnDemo = new javax.swing.JButton();
        btnViewBank = new javax.swing.JButton();
        btnViewDriver = new javax.swing.JButton();
        jp2 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerLocation(200);

        jp1.setBackground(new java.awt.Color(0, 191, 255));

        btnPersonalInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnPersonalInfo.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnPersonalInfo.setText("Enter Personal Info");
        btnPersonalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalInfoActionPerformed(evt);
            }
        });

        btnAddress.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnAddress.setText("Enter Address");
        btnAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressActionPerformed(evt);
            }
        });

        btnBanking.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnBanking.setText("Enter Banking Info");
        btnBanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBankingActionPerformed(evt);
            }
        });

        btnDriving.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnDriving.setText("Enter Driver's Info");
        btnDriving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrivingActionPerformed(evt);
            }
        });

        btnMedical.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnMedical.setText("Enter Medical Info");
        btnMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalActionPerformed(evt);
            }
        });

        btnViewReport.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnViewReport.setText("View final report");
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        btnViewAdd.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnViewAdd.setText("View Address");
        btnViewAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAddActionPerformed(evt);
            }
        });

        btnViewMed.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnViewMed.setText("View Medical Info");
        btnViewMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedActionPerformed(evt);
            }
        });

        btnDemo.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnDemo.setText("View Personal Info");
        btnDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemoActionPerformed(evt);
            }
        });

        btnViewBank.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnViewBank.setText("View Banking Info");
        btnViewBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBankActionPerformed(evt);
            }
        });

        btnViewDriver.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        btnViewDriver.setText("View Driver's Info");
        btnViewDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDriverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDriving, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMedical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDemo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBanking, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDriving, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMedical, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewBank, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewMed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btnViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jSplitPane1.setLeftComponent(jp1);

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setPreferredSize(new java.awt.Dimension(1200, 1100));

        lblWelcome.setFont(new java.awt.Font("Californian FB", 1, 60)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jp2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1217, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalInfoActionPerformed
            DemoInfoUI demoInfoUI = new DemoInfoUI(demoInfo);
            jSplitPane1.setRightComponent(demoInfoUI);
    }//GEN-LAST:event_btnPersonalInfoActionPerformed

    private void btnAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressActionPerformed
        AddressInfoUI addressInfoUI = new AddressInfoUI(addressInfo);
        jSplitPane1.setRightComponent(addressInfoUI);
    }//GEN-LAST:event_btnAddressActionPerformed

    private void btnBankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBankingActionPerformed
        BankingInfoUI bankingInfoUI = new BankingInfoUI(bankingInfo,bankingSavingsInfo,bankingCheckingInfo);
        jSplitPane1.setRightComponent(bankingInfoUI);
    }//GEN-LAST:event_btnBankingActionPerformed

    private void btnDrivingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrivingActionPerformed
        DriverInfoUI driverInfoUI = new DriverInfoUI(driverInfo);
        jSplitPane1.setRightComponent(driverInfoUI);
    }//GEN-LAST:event_btnDrivingActionPerformed

    private void btnMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalActionPerformed
        MedicalInfoUI medicalInfoUI = new MedicalInfoUI(medicalInfo);
        jSplitPane1.setRightComponent(medicalInfoUI);
    }//GEN-LAST:event_btnMedicalActionPerformed

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        ReportUI reportUI;
        try {
            reportUI = new ReportUI(demoInfo, addressInfo, bankingInfo, driverInfo, medicalInfo,bankingSavingsInfo,bankingCheckingInfo);
            jSplitPane1.setRightComponent(reportUI);
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewReportActionPerformed

    private void btnViewAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAddActionPerformed
        ViewAddressInfo viewAddressInfo = new ViewAddressInfo(addressInfo);
        jSplitPane1.setRightComponent(viewAddressInfo);
    }//GEN-LAST:event_btnViewAddActionPerformed

    private void btnViewMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedActionPerformed
        ViewMedicalInfo viewMedicalInfo = new ViewMedicalInfo(medicalInfo);
        jSplitPane1.setRightComponent(viewMedicalInfo);
    }//GEN-LAST:event_btnViewMedActionPerformed

    private void btnDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemoActionPerformed
        ViewPersonalInfo viewPersonalInfo = new ViewPersonalInfo(demoInfo);
        jSplitPane1.setRightComponent(viewPersonalInfo);
    }//GEN-LAST:event_btnDemoActionPerformed

    private void btnViewBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBankActionPerformed
        ViewBankingInfo viewBankingInfo = new ViewBankingInfo(bankingInfo,bankingSavingsInfo,bankingCheckingInfo);
        jSplitPane1.setRightComponent(viewBankingInfo);
    }//GEN-LAST:event_btnViewBankActionPerformed

    private void btnViewDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDriverActionPerformed
        ViewDriverInfo viewDriverInfo = new ViewDriverInfo(driverInfo);
        jSplitPane1.setRightComponent(viewDriverInfo);
    }//GEN-LAST:event_btnViewDriverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddress;
    private javax.swing.JButton btnBanking;
    private javax.swing.JButton btnDemo;
    private javax.swing.JButton btnDriving;
    private javax.swing.JButton btnMedical;
    private javax.swing.JButton btnPersonalInfo;
    private javax.swing.JButton btnViewAdd;
    private javax.swing.JButton btnViewBank;
    private javax.swing.JButton btnViewDriver;
    private javax.swing.JButton btnViewMed;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables

    private void displayWelcome() {
        ImageIcon imageIconOne = new ImageIcon("C:\\Users\\kisan\\Desktop\\AED\\welcome.jpg");
        Image image = imageIconOne.getImage();
        Image newimg = image.getScaledInstance(jp2.getWidth(), jp2.getHeight(),  java.awt.Image.SCALE_SMOOTH);  
        imageIconOne = new ImageIcon(newimg);
        lblWelcome.setIcon(imageIconOne);
    }
}
