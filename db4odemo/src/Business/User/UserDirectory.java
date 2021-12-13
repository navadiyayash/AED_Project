/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author yashn
 */
public class UserDirectory {
    private ArrayList<User> userLst;

    public UserDirectory() {
        userLst = new ArrayList();
    }

    public ArrayList<User> getUserLst() {
        return userLst;
    }
    
    public User createUser(String U_name){
        User user = new User();
    
        userLst.add(user);
        user.setU_name(U_name); 
        return user;
    }
  
}
