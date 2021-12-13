/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.MechanicRole;
import Business.Role.RTORole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yashn
 */
public class RtoOrg extends Organizations{
     public RtoOrg() {
        super(Organizations.Type.RTO.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RTORole());
        return roles;
    }
}
