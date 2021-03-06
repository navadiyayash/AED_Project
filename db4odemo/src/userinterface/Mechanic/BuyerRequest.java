/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Mechanic;

/**
 *
 * @author saneel
 */
import Business.Email.Email;
import Business.WorkQueue.BuyerVehicleWorkReq;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//class request or enum requsted
public class BuyerRequest extends javax.swing.JPanel {

    private JPanel container;
    private BuyerVehicleWorkReq request;

    /**
     * Creates new form BuyerReq
     */
    public BuyerRequest(JPanel container, BuyerVehicleWorkReq request) {
        initComponents();
        this.container = container;
        this.request=request;
//        txtMaintDetails.setText(request.getMilesDriven());
//        txtModel.setText(request.getVehModel());
        txtReqdVeh.setText(request.getVehicle());
        txtDate.setText(request.getManuYear());  //int cannot be converted to string
//        txtCondition.setText(request.getVehCond());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblReqdVeh = new javax.swing.JLabel();
        lblManuDate = new javax.swing.JLabel();
        lblVehUse = new javax.swing.JLabel();
        txtReqdVeh = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtUsability = new javax.swing.JTextField();

        setBackground(new java.awt.Color(240, 234, 199));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setText("Submit Details");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buyer Details");

        lblReqdVeh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReqdVeh.setText("Buyer Preference :");

        lblManuDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblManuDate.setText("Manufacturing Date :");

        lblVehUse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVehUse.setText("Vehicle Usability ?");

        txtReqdVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReqdVehActionPerformed(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReqdVeh)
                            .addComponent(lblManuDate)
                            .addComponent(lblVehUse, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReqdVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btnSubmit)))
                .addContainerGap(382, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDate, txtReqdVeh, txtUsability});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblManuDate, lblReqdVeh, lblVehUse});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReqdVeh)
                    .addComponent(txtReqdVeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManuDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVehUse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSubmit)
                .addGap(280, 280, 280))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDate, txtReqdVeh, txtUsability});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MechanicWork mw = (MechanicWork) component;
        mw.populateTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        request.setVehicle(txtUsability.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null,"Results Submitted!!");
        try{
            Email emailConfig= new Email();
            Properties smtpProperties = emailConfig.loadProperties();
            String email = String.valueOf(request.getSender());
            emailConfig.sendEmail(smtpProperties, email, "REquest completed", "Your request has being fullfilled please check the applications to get the details");
        }
            catch(Exception ex){
                
            }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtReqdVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReqdVehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReqdVehActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblManuDate;
    private javax.swing.JLabel lblReqdVeh;
    private javax.swing.JLabel lblVehUse;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtReqdVeh;
    private javax.swing.JTextField txtUsability;
    // End of variables declaration//GEN-END:variables
}
