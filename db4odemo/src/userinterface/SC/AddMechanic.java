/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SC;

import Business.Organizations.OrgDir;
import Business.Organizations.Organizations;
import Business.User.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashn/saneel
 */
public class AddMechanic extends javax.swing.JPanel {

    /**
     * Creates new form AddMechanic
     */
    private JPanel container;
        private OrgDir orgdir;

 //private OrgDir orgdir;
    public AddMechanic(JPanel container, OrgDir orgdir) {
        initComponents();
        this.container = container;
        this.orgdir = orgdir;
        
        populatecbCompany();

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
        cbCompany = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompany = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreateMech = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 234, 199));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add a New Mechanic to Organization");

        jLabel2.setText("Select Mechanic : ");

        cbCompany.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCompanyActionPerformed(evt);
            }
        });

        tblCompany.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompany.setShowHorizontalLines(false);
        tblCompany.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblCompany);
        if (tblCompany.getColumnModel().getColumnCount() > 0) {
            tblCompany.getColumnModel().getColumn(0).setResizable(false);
            tblCompany.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name :");

        btnCreateMech.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateMech.setText("Add Name");
        btnCreateMech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMechActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(jLabel2)
                            .addGap(97, 97, 97)
                            .addComponent(cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateMech, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142)))
                .addContainerGap(874, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57)
                .addComponent(btnCreateMech)
                .addContainerGap(340, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateMechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMechActionPerformed
        // TODO add your handling code here:
        
        Organizations organization = (Organizations) cbCompany.getSelectedItem();
        String name = txtName.getText();

        if(cbCompany.getItemCount()==0){
        JOptionPane.showMessageDialog(null, "You will need to select compnay First!");
            return;
        }
                
            
         if(txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Will you please enter the Mechanic's name!");
            return;
        }
         else {
          
                  for(User u:organization.getUserDir().getUserLst()){
                        if(txtName.getText().equalsIgnoreCase(u.getU_name())){
                            JOptionPane.showMessageDialog(null,"The User Name is already in the database !");
                            return;
                        }
                        
                    }
           
             }
         organization.getUserDir().createUser(name);
         populateTable(organization);
        
         JOptionPane.showMessageDialog(null, "Mechanic has been created without any issue!");
        
         txtName.setText(""); //empty text field as soon as one mechanic added
    }//GEN-LAST:event_btnCreateMechActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCompanyActionPerformed
        // TODO add your handling code here:
        
         Organizations organization = (Organizations) cbCompany.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_cbCompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateMech;
    private javax.swing.JComboBox cbCompany;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCompany;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables



public void populatecbCompany(){
        cbCompany.removeAllItems();
        
        for (Organizations organization : orgdir.getOrgLst()){
            cbCompany.addItem(organization);
        }
    }
    
    
    private void populateTable(Organizations organization){
        DefaultTableModel model = (DefaultTableModel) tblCompany.getModel();
        
        model.setRowCount(0);
        
        for (User user : organization.getUserDir().getUserLst()){
            Object[] row = new Object[2];
            row[0] = user.getU_id();
            row[1] = user.getU_name();
            model.addRow(row);
        }
    }
}
