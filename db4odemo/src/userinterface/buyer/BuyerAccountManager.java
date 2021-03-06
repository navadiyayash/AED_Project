/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.buyer;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAcc;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yashn/saneel
 */
public class BuyerAccountManager extends javax.swing.JPanel {

    /**
     * Creates new form BuyerAccountManager
     */
    private JPanel container;
    private UserAcc acc;
    private Enterprise ENPR;

    public BuyerAccountManager(JPanel container, UserAcc acc, Enterprise ENPR) {
        initComponents();

        this.container = container;
        this.acc = acc;
        this.ENPR = ENPR;
        txtUserName.setEditable(false);
        txtUserName.setText(acc.getU_name());
        txtPassword.setEditable(false);
        txtNewPassword.setEditable(false);
        txtSecurityAns.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblNewPass = new javax.swing.JLabel();
        lblSecQue = new javax.swing.JLabel();
        lblSecAns = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        btnSubmitNewPass = new javax.swing.JButton();
        txtNewPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cbSecurityQue = new javax.swing.JComboBox<>();
        txtSecurityAns = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSetSecurityQue = new javax.swing.JButton();
        btnSubmitSecurity = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 234, 199));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Manage The Buyer Account");

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setText("User Name:");

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPass.setText("Password:");

        lblNewPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewPass.setText("New Password:");

        lblSecQue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSecQue.setText("Security Questions:");

        lblSecAns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSecAns.setText("Security Answers:");

        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnSubmitNewPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmitNewPass.setText("Submit");
        btnSubmitNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitNewPassActionPerformed(evt);
            }
        });

        cbSecurityQue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mothers name ?", "Name of your Dog?", "Name of your School ?", "What is your Favoutite Food ?", " " }));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSetSecurityQue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSetSecurityQue.setText("Set Security Questions?");
        btnSetSecurityQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetSecurityQueActionPerformed(evt);
            }
        });

        btnSubmitSecurity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmitSecurity.setText("Submit");
        btnSubmitSecurity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitSecurityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnSetSecurityQue)
                        .addGap(82, 82, 82)
                        .addComponent(btnSubmitSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNewPass)
                                    .addComponent(lblUserName)
                                    .addComponent(lblPass))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSecQue)
                                    .addComponent(lblSecAns))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbSecurityQue, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSecurityAns, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnChangePassword)
                                .addGap(99, 99, 99)
                                .addComponent(btnSubmitNewPass)))))
                .addContainerGap(1042, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnChangePassword, btnSubmitNewPass});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblPass))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPass)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangePassword)
                    .addComponent(btnSubmitNewPass))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecQue)
                    .addComponent(cbSecurityQue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecAns)
                    .addComponent(txtSecurityAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSetSecurityQue)
                    .addComponent(btnSubmitSecurity))
                .addContainerGap(522, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnChangePassword, btnSubmitNewPass});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSetSecurityQue, btnSubmitSecurity});

    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        txtPassword.setEditable(true);
        txtNewPassword.setEditable(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnSetSecurityQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetSecurityQueActionPerformed
        // TODO add your handling code here:
        txtSecurityAns.setEditable(true);
        cbSecurityQue.setEnabled(true);
    }//GEN-LAST:event_btnSetSecurityQueActionPerformed

    private void btnSubmitNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitNewPassActionPerformed
        // TODO add your handling code here:
        String pass = txtPassword.getText();
        if (!(pass.equals(acc.getPass()))) {
            JOptionPane.showMessageDialog(null, "Original Password Incorrect");
            return;
        } else {
            String newpass = txtNewPassword.getText();
            acc.setPass(newpass);
            JOptionPane.showMessageDialog(null, "Successfully Changed Password ");
        }
    }//GEN-LAST:event_btnSubmitNewPassActionPerformed

    private void btnSubmitSecurityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitSecurityActionPerformed
        // TODO add your handling code here:
        if (txtSecurityAns.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Security Answer first!!");
            return;
        } else {
            acc.setSecQ((String) cbSecurityQue.getSelectedItem());
            acc.setSecA(txtSecurityAns.getText());
            acc.setVal(1);
            JOptionPane.showMessageDialog(null, "Security Question added without any issue");
        }
    }//GEN-LAST:event_btnSubmitSecurityActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnSetSecurityQue;
    private javax.swing.JButton btnSubmitNewPass;
    private javax.swing.JButton btnSubmitSecurity;
    private javax.swing.JComboBox<String> cbSecurityQue;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSecAns;
    private javax.swing.JLabel lblSecQue;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtNewPassword;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSecurityAns;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
