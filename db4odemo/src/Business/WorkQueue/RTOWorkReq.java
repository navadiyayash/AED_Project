/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Buyer.Buyer;
import Business.Mechanic.Mechanic;
import Business.Seller.Seller;

/**
 *
 * @author yashn
 */
public class RTOWorkReq extends WorkRequest{
    
   private String Seller;
   private String Buyer;
   private String Mechanic;

    public String getSeller() {
        return Seller;
    }

    public void setSeller(Seller seller) {
        this.Seller = Seller;
    }

    public String getBuyer() {
        return Buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.Buyer = Buyer;
    }

    public String getMechanic() {
        return Mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.Mechanic = Mechanic;
    }
   
       
    
}
