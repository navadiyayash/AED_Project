/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.RTO;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EPType;
import Business.Netwrk.Netwrk;
import Business.Organizations.Organizations;
import Business.Organizations.Organizations.Type;
import javax.swing.JPanel;
import Business.RTO.RTO;
import Business.RTO.RTODirectory;
import Business.Role.LoanAdminRole;
import Business.Role.RTORole;
import Business.User.User;
import Business.UserAccount.UserAcc;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author yashn
 */
public class Add_RTO extends javax.swing.JPanel {

    /**
     * Creates new form Add_RTO
     */
    JPanel container;
    EcoSystem system;
    RTODirectory rtoDirectory;
    Netwrk network;
    
    public Add_RTO(JPanel container, EcoSystem system) {
        initComponents();
        rtoDirectory = new RTODirectory();
        this.container = container;
        this.system = system;
        populatenetwork();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        username_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        cbNetwork = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 234, 215));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD Department of Transportation (MASSDOT)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NAME :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("User Name: ");

        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });

        submit_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        cbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("<Back");
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
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1688, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit_btn)
                    .addComponent(cbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(name_txt)
                        .addComponent(username_txt)
                        .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(cbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(submit_btn)
                .addContainerGap(556, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_name_txtActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:
//        Organizations organization = (Organizations) cbNetwork.getSelectedItem();
//        String name = name_txt.getText();
//
//        if(cbNetwork.getItemCount()==0){
//        JOptionPane.showMessageDialog(null, "You will need to select compnay First!");
//            return;
//        }
//                
//            
//         if(name_txt.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Will you please enter the RTO's name!");
//            return;
//        }
//         else {
//          
//                  for(User u:organization.getUserDir().getUserLst()){
//                        if(name_txt.getText().equalsIgnoreCase(u.getU_name())){
//                            JOptionPane.showMessageDialog(null,"The User Name is already in the database !");
//                            return;
//                        }
//                        
//                    }
//           
//             }
//         organization.getUserDir().createUser(name);
//         populatenetwork();
//        
//         JOptionPane.showMessageDialog(null, "Mechanic has been created without any issue!");
//        
//         name_txt.setText(""); 
        
        
        Netwrk network = (Netwrk) cbNetwork.getSelectedItem();
                String name = name_txt.getText();
        String username = username_txt.getText();
        String passwword = password_txt.getText();
        
        RTO rto = new RTO(name);
        rto.setName(name);
        rto.setEmail(username);
        rto.setPassword(passwword);
        rtoDirectory.addRTO_Off(rto);
        JOptionPane.showMessageDialog(this, "RTO ADDED");
        Enterprise.EPType type = EPType.RTO;
        System.out.println("***"+network);
        Enterprise enterprise = network.getEnpr().createAndAddEnterprise(name,type);
        //Enterprise enterprise = new Enterprise(name, type);
        UserAcc account = enterprise.getUserAccDir().createUserAcc(username, passwword, new RTORole());
        System.out.println(account);
    }//GEN-LAST:event_submit_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void populatenetwork(){
               cbNetwork.removeAllItems();

        for (Netwrk network : system.getNtwkLst()) {
            cbNetwork.addItem(network);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbNetwork;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField password_txt;
    private javax.swing.JButton submit_btn;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
