/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.RTO;

import java.util.ArrayList;

/**
 *
 * @author yashn
 */
public class RTODirectory {
        private ArrayList<RTO> rtoDirectory;

    public RTODirectory() {
        this.rtoDirectory = new ArrayList<RTO>();
    }
    
    public RTO createRTOofficer(String name){
        RTO rto = new RTO(name);
        this.rtoDirectory.add(rto);
        return rto;
                
    }
    
    public void addRTO_Off(RTO rto){
        this.rtoDirectory.add(rto);
    }
    
    public ArrayList<RTO> getRTOoff(){
        return this.rtoDirectory;
    }
}
