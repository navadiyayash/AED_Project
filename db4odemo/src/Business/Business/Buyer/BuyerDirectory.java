/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Buyer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yashn
 */
public class BuyerDirectory {
    private List<Buyer> buyerLst;
    public BuyerDirectory(){
     buyerLst = new ArrayList<Buyer>();   
     
    }

    public List<Buyer> getBuyerLst() {
        return buyerLst;
    }

    public void setBuyerLst(List<Buyer> buyerLst) {
        this.buyerLst = buyerLst;
    }
    
    
    public Buyer addBuyer(){
        Buyer newBuyer = new Buyer();
        buyerLst.add(newBuyer);
        return newBuyer;
        
        
    }
}
