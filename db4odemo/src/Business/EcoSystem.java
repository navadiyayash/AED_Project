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
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author yashn
 */
public class EcoSystem extends Organizations{
    
    private static EcoSystem AUTO;
    
//    private RestaurantDirectory restaurantDirectory;
//    private CustomerDirectory customerDirectory;
//    private DeliveryManDirectory deliveryManDirectory;
    
    private ArrayList<Netwrk> ntwkLst;

//    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {
//
//        this.restaurantDirectory = restaurantDirectory;
//        this.customerDirectory = customerDirectory;
//        this.deliveryManDirectory = deliveryManDirectory;
//    }
//    
    public static EcoSystem getInstance(){
        if(AUTO==null){
            AUTO=new EcoSystem();
        }
        return AUTO;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
