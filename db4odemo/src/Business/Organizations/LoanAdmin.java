/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.LoanAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class LoanAdmin extends Organizations {
    public LoanAdmin()  {
        super(Organizations.Type.LoanAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LoanAdminRole());
        return roles;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
