/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.User.UserDirectory;
import Business.UserAccount.UserAccDir;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harsh
 */
public abstract class Organizations {
    
    private int orgId;
    private static int counter=0;
    private String name;
    private WorkQueue workQueue;
    private WorkQueue costEstimate;
    private WorkQueue moneyClaim;
    private UserDirectory userDir;
    private UserAccDir userAccDir;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue getCostEstimate() {
        return costEstimate;
    }

    public void setCostEstimate(WorkQueue costEstimate) {
        this.costEstimate = costEstimate;
    }

    public WorkQueue getMoneyClaim() {
        return moneyClaim;
    }

    public void setMoneyClaim(WorkQueue moneyClaim) {
        this.moneyClaim = moneyClaim;
    }

    public UserDirectory getUserDir() {
        return userDir;
    }

    public void setUserDir(UserDirectory userDir) {
        this.userDir = userDir;
    }

    public UserAccDir getUserAcctDir() {
        return userAccDir;
    }

    public void setUserAcctDir(UserAccDir userAcctDir) {
        this.userAccDir = userAcctDir;
    }
    
    public enum Type{
        SCAdmin("SCAdmin Organization"), UserAdmin("UserAdmin Organization"), LoanAdmin("LoanAdmin Organization"), Mechanic("Mechanic Organization"), Buyer("Buyer Organization"), Seller("Seller Organization"), LoanAgent("Loan Agent");
    private String value;
    private Type(String value) {
        this.value=value;
    }
    public String getValue(){
        return value;
    } 
    }
    
    public Organizations(String name) {
        this.name=name;
        this.costEstimate = new WorkQueue();
        this.moneyClaim= new WorkQueue();
        userDir=new UserDirectory();
        userAccDir=new UserAccDir();
        orgId=counter;
        ++counter;
        
        
    }

   
    
      @Override
    public String toString() {
        return name;
    }
}
