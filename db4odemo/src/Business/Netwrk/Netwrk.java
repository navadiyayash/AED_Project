/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Netwrk;

import Business.Enterprise.EPDir;

/**
 *
 * @author harsh
 */
public class Netwrk {
    private String NetwrkName;    
private EPDir enpr;

    public Netwrk() {
        enpr=new EPDir();
    }

    public String getNetwrkName() {
        return NetwrkName;
    }

    public void setNetwrkName(String NetwrkName) {
        this.NetwrkName = NetwrkName;
    }

    public EPDir getEnpr() {
        return enpr;
    }

    public void setEnpr(EPDir enpr) {
        this.enpr = enpr;
    }
    public String toString()
    {
        return NetwrkName;
    }
}
