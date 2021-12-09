/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.SC.SCWorkAreaPanel;

/**
 *
 * @author harsh
 */
public class AdminRole extends Role {
//implement all abstract classes

    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAcc account, Organizations organization, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return new SCWorkAreaPanel(RightPanel, enterprise);
    }
}
