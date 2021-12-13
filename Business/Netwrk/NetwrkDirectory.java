/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Netwrk;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class NetwrkDirectory {
    
        private ArrayList<Netwrk> netwrkLst;

    public NetwrkDirectory(){
    
        netwrkLst = new ArrayList<Netwrk>();
    }
    
    public ArrayList<Netwrk> getnetwrkLst() {
        return netwrkLst;
    }
    
    public void setnetwrkLst(ArrayList<Netwrk> netwrkLst) {
        this.netwrkLst = netwrkLst;
    }
    
      public Netwrk addNetwrk() {
    Netwrk netwrk=new Netwrk();
    netwrkLst.add(netwrk);
    return netwrk;
    }
      
       public void removeNetwrk (Netwrk netwrk) {
        netwrkLst.remove(netwrk);
    }
    
    
}
