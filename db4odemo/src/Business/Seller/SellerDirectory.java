/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import java.util.ArrayList;

/**
 *
 * @author saneel
 */

public class SellerDirectory {
    private ArrayList<Seller> sellerList;

    public SellerDirectory(){
        sellerList = new ArrayList<Seller>();
    }

    public ArrayList<Seller> getSellerList() {
        return sellerList;
    }

    public void setSellerList(ArrayList<Seller> sellerList) {
        this.sellerList = sellerList;
    }
    
    public Seller addSeller(){
        Seller seller =new Seller();
        sellerList.add(seller);
        return seller;
    }
    public void removeSeller(Seller seller) {
        sellerList.remove(seller);
    }

}
       
 
