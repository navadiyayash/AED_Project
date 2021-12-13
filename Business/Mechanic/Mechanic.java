/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Mechanic;

/**
 *
 * @author harsh
 */
public class Mechanic {
    
    private String name ;
    private String ServiceCenter ;
    private int Number;
    private String Email;
    private String Date;
    private String UserName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceCenter() {
        return ServiceCenter;
    }

    public void setServiceCenter(String ServiceCenter) {
        this.ServiceCenter = ServiceCenter;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    @Override
    public String toString(){
        return UserName;
    }

}
