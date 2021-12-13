/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class AdminOrg extends Organizations {
        public AdminOrg() {
        super(Type.SCAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
}
