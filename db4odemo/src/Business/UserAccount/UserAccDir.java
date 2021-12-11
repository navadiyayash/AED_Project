/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Role.Role;
import Business.User.User;
import Business.UserAccount.UserAcc;
import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class UserAccDir {
    private ArrayList<UserAcc> userAccs;
public UserAccDir()
{
    userAccs=new ArrayList<UserAcc>();
}

    public ArrayList<UserAcc> getUserAccs() {
        return userAccs;
    }

    public void setUserAccs(ArrayList<UserAcc> userAccs) {
        this.userAccs = userAccs;
    }
    public UserAcc createUserAcc(String U_name, String pass, Role role)
    {
        UserAcc ua=new UserAcc();
        userAccs.add(ua);
        //ua.setUser(user);
        ua.setU_name(U_name);
        ua.setRole(role);
        ua.setPass(pass);
        return ua;
    }
    public UserAcc authenticateUser(String U_name, String pass){
        for (UserAcc ua : userAccs)
            if (ua.getU_name().equals(U_name) && ua.getPass().equals(pass)){
                return ua;
            }
        return null;
    }

    public UserAcc createUserAcc(String U_name, String pass, User user, Role role){
        UserAcc userAcc = new UserAcc();
        userAcc.setU_name(U_name);
        userAcc.setPass(pass);
        userAcc.setUser(user);
        userAcc.setRole(role);
        userAccs.add(userAcc);
        return userAcc;
    }
   

    public boolean checkIfUsernameIsUnique(String U_name){
        for (UserAcc ua : userAccs){
            if (ua.getU_name().equals(U_name))
                return false;
        }
        return true;
    }
    
    
}
