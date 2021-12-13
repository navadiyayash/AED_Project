/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.Organizations.SellerOrg;
import Business.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.VehicleSeller.ManageSeller;

/**
 *
 * @author saneel
 */
public class SellerRole extends Role{
//implement all abstract classes
    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAcc account, Organizations organization, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return new ManageSeller(RightPanel, account, (SellerOrg)organization,enterprise, business);
    }
        @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
