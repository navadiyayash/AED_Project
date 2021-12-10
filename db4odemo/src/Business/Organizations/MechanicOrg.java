/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.MechanicRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanee
 */
public class MechanicOrg extends Organizations{
    public MechanicOrg() {
        super(Organizations.Type.Mechanic.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MechanicRole());
        return roles;
    }
}
