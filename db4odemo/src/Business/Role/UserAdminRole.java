/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAcc;
import UserInterface.Users.UserWorkArea;
import javax.swing.JPanel;
import userinterface.SC.SCWorkArea;

/**
 *
 * @author harsh
 */
public class UserAdminRole extends Role {
//abstract method
    @Override
    public JPanel createWorkArea(JPanel container, UserAcc account, Organizations organization, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return new UserWorkArea ( container,enterprise);
    }
    //once you put usernamee and password in enterprise types, based on return value you will be directed to user work area
}
