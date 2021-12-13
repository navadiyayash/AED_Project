/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAcc;
import userinterface.BuySellNetwork.NetWork;
import static java.time.Clock.system;
import javax.swing.JPanel;

/**
 *
 * @author saneel
 */
public class SysAdminRole extends Role{
//abstract method
    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAcc account, Organizations organization, Enterprise enterprise, EcoSystem system) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return new NetWork(RightPanel,system);
    }
    
}
