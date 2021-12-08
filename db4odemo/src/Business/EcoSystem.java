/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Netwrk.Netwrk; 

//import Business.Customer.CustomerDirectory;
//import Business.DeliveryMan.DeliveryManDirectory;
//import Business.Restaurant.RestaurantDirectory;

import Business.Organizations.Organizations;

import Business.Role.Role;
import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author yashn
 */
public class EcoSystem extends Organizations{
    
    private static EcoSystem AUTO;
    
    
    private ArrayList<Netwrk> ntwkLst;

   
    public static EcoSystem getInstance(){
        if(AUTO==null){
            AUTO=new EcoSystem();
        }
        return AUTO;
    }
     public Netwrk createAndAddNetwrk()
    {
        Netwrk netwrk = new Netwrk();
        ntwkLst.add(netwrk);
        return netwrk;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SysAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       ntwkLst=new ArrayList<Netwrk>();
    }

    public ArrayList<Netwrk> getNtwkLst() {
        return ntwkLst;
    }

    public void setNtwkLst(ArrayList<Netwrk> ntwkLst) {
        this.ntwkLst = ntwkLst;
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
//       return false;
       if(!this.getUserAccDir().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Netwrk netwrk:ntwkLst){
            
        }
        return true;
    }

    }

