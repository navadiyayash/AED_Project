/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.LoanAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yashn
 */
public class LoanAgent extends Organizations{
    public LoanAgent() {
        super(Organizations.Type.LoanAgent.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new LoanAgentRole());
        return roles;//To change body of generated methods, choose Tools | Templates.
    }
    
}
