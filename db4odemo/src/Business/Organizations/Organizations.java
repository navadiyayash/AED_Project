/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.Role;
import Business.User.UserDirectory;
import Business.UserAccount.UserAccDir;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author yashn
 */
public abstract class Organizations {

    private String Name;
    private int orgId;
    private WorkQueue WorkQueue;
    private WorkQueue CostEstimate;
    private WorkQueue MoneyClaim;
    private UserDirectory UserDir;
    private UserAccDir UserAccDir;
//    private static int counter=0;
    private static int counter = 0;

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organizations.counter = counter;
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public WorkQueue getWorkQueue() {
        return WorkQueue;
    }

    public void setWorkQueue(WorkQueue WorkQueue) {
        this.WorkQueue = WorkQueue;
    }

    public WorkQueue getCostEstimate() {
        return CostEstimate;
    }

    public void setCostEstimate(WorkQueue CostEstimate) {
        this.CostEstimate = CostEstimate;
    }

    public WorkQueue getMoneyClaim() {
        return MoneyClaim;
    }

    public void setMoneyClaim(WorkQueue MoneyClaim) {
        this.MoneyClaim = MoneyClaim;
    }


}
