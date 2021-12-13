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
public class RTO_Officer_Directory {
    private ArrayList<RTO_Officer> rtoOfficerDirectory;

    public RTO_Officer_Directory() {
        this.rtoOfficerDirectory = new ArrayList<RTO_Officer>();
    }
    
    public RTO_Officer createRTOofficer(){
        RTO_Officer rto = new RTO_Officer();
        this.rtoOfficerDirectory.add(rto);
        return rto;
                
    }
    
    public void addRTO_Off(RTO_Officer rto){
        this.rtoOfficerDirectory.add(rto);
    }
    
    public ArrayList<RTO_Officer> getRTOoff(){
        return this.rtoOfficerDirectory;
    }
    
}
