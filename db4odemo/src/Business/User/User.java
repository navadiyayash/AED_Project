/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

/**
 *
 * @author yashn
 */
public class User {
     private String U_name;
    private int U_id;
    private static int counter = 1;
    
    public User() {
        
        U_id = counter;
        counter++;
    }

    public String getU_name() {
        return U_name;
    }

    public void setU_name(String U_name) {
        this.U_name = U_name;
    }

    public int getU_id() {
        return U_id;
    }

    public void setU_id(int U_id) {
        this.U_id = U_id;
    }

     @Override
    public String toString() {
        return U_name;
    }
    
    
}
