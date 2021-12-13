/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import java.util.ArrayList;

/**
 *
 * @author yashn
 */
public class Seller {
    
    private String Name;
    private String Email;
    private int PhNo;
    private String City;
    private String State;
    private int ZipCode;
    private String UserName;
    private String Password;
    private String securityQue;
    private SellerDirectory sellerdirectory;
    private ArrayList<String> sellervehiclelist;
    
    public Seller(){
        sellerdirectory=new SellerDirectory();
        sellervehiclelist = new ArrayList<String>();
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhNo() {
        return PhNo;
    }

    public void setPhNo(int PhNo) {
        this.PhNo = PhNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getSecurityQue() {
        return securityQue;
    }

    public void setSecurityQue(String securityQue) {
        this.securityQue = securityQue;
    }

    public String getSecurityAns() {
        return securityAns;
    }

    public void setSecurityAns(String securityAns) {
        this.securityAns = securityAns;
    }

    public ArrayList<String> getSellerOrg() {
        return SellerOrg;
    }

    public void setSellerOrg(ArrayList<String> SellerOrg) {
        this.SellerOrg = SellerOrg;
    }
    private String securityAns;
    private ArrayList<String> SellerOrg;
    
    @Override
    public String toString(){
        return UserName;
    }
    
 }


