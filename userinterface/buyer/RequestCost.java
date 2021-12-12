/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.buyer;

import Business.EcoSystem;
//import Business.Email.Email;
import Business.Enterprise.Enterprise;
import Business.Netwrk.Netwrk;
import Business.Organizations.BuyerOrg;
import Business.Organizations.MechanicOrg;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAcc;
import Business.WorkQueue.BuyerCostWorkReq;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saneel/yash
 */
public class RequestCost extends javax.swing.JPanel {

    /**
     * Creates new form RequestCost
     */
    private JPanel container;
    private EcoSystem system;
    private UserAcc acc;
    private Enterprise ENPR;
    private Enterprise SC;
    private Netwrk lc;
    private Netwrk netwrk;

    public RequestCost(JPanel container, UserAcc acc, Enterprise ENPR, EcoSystem system, Netwrk lc, Enterprise SC) {
        initComponents();

        this.container = container;
        this.acc = acc;
        this.ENPR = ENPR;
        this.system = system;
        this.netwrk = netwrk;
        this.lc = lc;
        btnClaim.setEnabled(false);    //initially we put claim money button on hold 
        this.SC = SC;
        popTF();
    }

    public void popTF() {
        DefaultTableModel model = (DefaultTableModel) tblCost.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : acc.getCq().getWorkReqLst()) {
            Object[] row = new Object[4];
            row[0] = wr.getMsg();
            row[1] = wr.getReceiver();
            row[2] = wr.getStatus();
            String result = ((BuyerCostWorkReq) wr).getMaintainCost();
            row[3] = result == null ? "Awaiting" : result;
            if (result == null) {
                btnClaim.setEnabled(false);
            } else {
                btnClaim.setEnabled(true);

                //     row[0] = w.getStatus();
                //     row[1] = w.getMessage();
                model.addRow(row);
            }
        }
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
        btnBack = new javax.swing.JButton();
        btnClaim = new javax.swing.JButton();
        btnReq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCost = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbVehicle = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(240, 234, 199));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText(" Request for Estimate Cost");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClaim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClaim.setText("Claim Money");
        btnClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaimActionPerformed(evt);
            }
        });

        btnReq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReq.setText("Request");
        btnReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqActionPerformed(evt);
            }
        });

        tblCost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vehicle", "Receiver", "Status", "Cost"
            }
        ));
        jScrollPane1.setViewportView(tblCost);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Vehicle Required :");

        cbVehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Motorcycle", "Sedan", "SUV", "SuperCar", "Pickup Truck" }));
        cbVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVehicleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnClaim)
                        .addGap(97, 97, 97)
                        .addComponent(btnReq))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(807, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClaim)
                    .addComponent(btnReq))
                .addContainerGap(563, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaimActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCost.getSelectedRow();
        if (selectedRow >= 0) {
            VehicleLoan i = new VehicleLoan(container, acc, ENPR, netwrk, system, lc, SC, (String)tblCost.getValueAt(tblCost.getSelectedRow(), 3));
            CardLayout layout = (CardLayout) container.getLayout();
            container.add(i);
            layout.next(container);
        } else
            JOptionPane.showMessageDialog(null, "Please Select a row !");
    }//GEN-LAST:event_btnClaimActionPerformed

    private void btnReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqActionPerformed
        // TODO add your handling code here:
        if (cbVehicle.getSelectedItem().equals("--Select--")) {
            JOptionPane.showMessageDialog(null, "Please select a Vehicle !");
            return;

        } else {
            Organizations org = null;
            for (Netwrk netwrk : system.getNtwkLst()) {
                for (Enterprise enpr : netwrk.getEnpr().getEpLst()) {
                    for (Organizations o : enpr.getOrgDir().getOrgLst()) {
                        if (netwrk.equals(lc)) {
                            if (enpr.equals(SC)) {
                                if (o instanceof MechanicOrg) {
                                    org = o;

                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (org != null) {

                String msg = (String) cbVehicle.getSelectedItem();
                BuyerCostWorkReq request = new BuyerCostWorkReq();
                request.setMsg(msg);
                request.setSender(acc);
                request.setStatus("Sent");
                org.getCostEstimate().getWorkReqLst().add(request);
                acc.getCq().getWorkReqLst().add(request);
                JOptionPane.showMessageDialog(null, "cost estimate sent !");
                popTF();
//                try {
//                    Email emailConfig = new Email();
//                    Properties smtpProperties = emailConfig.loadProperties();
//                    String email = acc.getU_name();
//                    emailConfig.sendEmail(smtpProperties, email, "Request Initiated", "Your request has being sent to the Service center");
//                } catch (Exception ex) {
//
//                }
            }
            if (org == null) {
                JOptionPane.showMessageDialog(null, "There was no Mechanic in the Service Center  you have Selected !");
                return;
            }
        }
    }//GEN-LAST:event_btnReqActionPerformed

    private void cbVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVehicleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClaim;
    private javax.swing.JButton btnReq;
    private javax.swing.JComboBox<String> cbVehicle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblCost;
    // End of variables declaration//GEN-END:variables

}
