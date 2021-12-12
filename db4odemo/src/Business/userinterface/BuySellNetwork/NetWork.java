/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuySellNetwork;

import Business.EcoSystem;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JPanel;
import UI.RTO.Add_RTO;

/**
 *
 * @author yashn
 */
public class NetWork extends javax.swing.JPanel {

    /**
     * Creates new form OptnWork
     */
    private JPanel container;
    private EcoSystem system;

    public NetWork(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;
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
        ManageNetworkBtn = new javax.swing.JButton();
        RegisterEnterBtn = new javax.swing.JButton();
        ManageEnterprises = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("NetWork Work Area");

        ManageNetworkBtn.setText("Manage Network");
        ManageNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageNetworkBtnActionPerformed(evt);
            }
        });

        RegisterEnterBtn.setText("Manage Enterprises");
        RegisterEnterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterEnterBtnActionPerformed(evt);
            }
        });

        ManageEnterprises.setText("Register Enterprises");
        ManageEnterprises.setPreferredSize(new java.awt.Dimension(100, 25));
        ManageEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEnterprisesActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(ManageNetworkBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(RegisterEnterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(ManageEnterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jButton1)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(ManageNetworkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageEnterprises, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addGap(77, 77, 77)
                .addComponent(RegisterEnterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(129, 129, 129))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void ManageNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageNetworkBtnActionPerformed
        // TODO add your handling code here:

        ManageNetwork mn = new ManageNetwork(container, system);   //create constructor in manage
        CardLayout layout = (CardLayout) container.getLayout();
        container.add(mn);
        layout.next(container);
    }//GEN-LAST:event_ManageNetworkBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageEnterprises;
    private javax.swing.JButton ManageNetworkBtn;
    private javax.swing.JButton RegisterEnterBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
