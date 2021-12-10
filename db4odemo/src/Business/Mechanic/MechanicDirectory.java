/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Mechanic;

import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class MechanicDirectory {
    private ArrayList<Mechanic> MechanicLst;
    
    public MechanicDirectory(){
        MechanicLst = new ArrayList<Mechanic>();
    }
    
    public ArrayList<Mechanic> getMechanicList(){
        return MechanicLst;
        
    }
    
    public Mechanic createMechanic(){
        Mechanic mechanic = new Mechanic();
        MechanicLst.add(mechanic);
        return mechanic;
    }
}
