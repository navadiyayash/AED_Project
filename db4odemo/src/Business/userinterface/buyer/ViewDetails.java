/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.buyer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAcc;
import Business.WorkQueue.BuyerCostWorkReq;
import Business.WorkQueue.BuyerVehicleWorkReq;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashn/saneel
 */
public class ViewDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetails
     */
    private JPanel container;
    private UserAcc acc;
    private Enterprise ENPR;
    private EcoSystem System;

    public ViewDetails(JPanel container, UserAcc acc, Enterprise ENPR, EcoSystem System) {
        initComponents();

        this.container = container;
        this.acc = acc;
        this.ENPR = ENPR;
        this.System = System;
        popCReqTable();
        popTF();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCostReq = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBuySellReq = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(203, 199, 167));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cost Request Table");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Vehicle Request Table");

        tblCostReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Car", "Recevier", "Status", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCostReq);
        if (tblCostReq.getColumnModel().getColumnCount() > 0) {
            tblCostReq.getColumnModel().getColumn(0).setResizable(false);
            tblCostReq.getColumnModel().getColumn(1).setResizable(false);
            tblCostReq.getColumnModel().getColumn(2).setResizable(false);
            tblCostReq.getColumnModel().getColumn(3).setResizable(false);
        }

        tblBuySellReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Recevier", "Status", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblBuySellReq);
        if (tblBuySellReq.getColumnModel().getColumnCount() > 0) {
            tblBuySellReq.getColumnModel().getColumn(0).setResizable(false);
            tblBuySellReq.getColumnModel().getColumn(1).setResizable(false);
            tblBuySellReq.getColumnModel().getColumn(2).setResizable(false);
            tblBuySellReq.getColumnModel().getColumn(3).setResizable(false);
        }

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(987, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBuySellReq;
    private javax.swing.JTable tblCostReq;
    // End of variables declaration//GEN-END:variables

    public void popCReqTable() {
        DefaultTableModel model = (DefaultTableModel) tblBuySellReq.getModel();

        model.setRowCount(0);
        for (WorkRequest request : acc.getWorkQueue().getWorkReqLst()) {
            Object[] row = new Object[4];
            row[0] = request.getMsg();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((BuyerVehicleWorkReq) request).getVehicle();
            row[3] = result == null ? "Awaiting" : result;
            model.addRow(row);
        }
    }

    public void popTF() {
        DefaultTableModel model = (DefaultTableModel) tblCostReq.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : acc.getCq().getWorkReqLst()) {
            Object[] row = new Object[4];
            row[0] = wr.getMsg();
            row[1] = wr.getReceiver();
            row[2] = wr.getStatus();
            String result = ((BuyerCostWorkReq) wr).getMaintainCost();
            row[3] = result == null ? "Awaiting" : result;
            //     row[0] = w.getStatus();
            //     row[1] = w.getMessage();
            model.addRow(row);
        }

    }
}
