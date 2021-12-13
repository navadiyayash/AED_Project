/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAcc;
import InsuranceCompany.WorkSpaceForAgent;
import javax.swing.JPanel;

/**
 *
 * @author sanee
 */
public class LoanAgentRole extends Role{
//implement all abstract methods
    @Override
    public JPanel createWorkArea(JPanel container, UserAcc account, Organizations organization, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return new  WorkSpaceForAgent(container, business,organization,account);
    
}
        @Override
    public String toString() {
        return this.getClass().getName();
    }
}