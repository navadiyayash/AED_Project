/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.MechanicOrg;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.Mechanic.MechanicWork;

/**
 *
 * @author sanee
 */
public class MechanicRole extends Role {
//implement all abstract methods
    @Override
    public JPanel createWorkArea(JPanel container, UserAcc account, Organizations organization, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return new MechanicWork(container, account,(MechanicOrg)organization, enterprise, business);
    }
        @Override
    public String toString() {
        return this.getClass().getName();
    }
}
