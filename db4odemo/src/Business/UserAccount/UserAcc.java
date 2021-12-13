/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Role.Role;
import Business.User.User;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harsh
 */
public class UserAcc {

    private String U_name;
    private String pass;
    private Role role;
    private String secQ;
    private String PhNo;
    private int val = 0;

    private WorkQueue ClaimMoney;
    private WorkQueue cq;
    private WorkQueue workQueue;

    private String secA;

    public UserAcc() {

        workQueue = new WorkQueue();
        cq = new WorkQueue();
        ClaimMoney = new WorkQueue();

    }

    public WorkQueue getClaimMoney() {
        return ClaimMoney;
    }

    public void setClaimMoney(WorkQueue ClaimMoney) {
        this.ClaimMoney = ClaimMoney;
    }

    public WorkQueue getCq() {
        return cq;
    }

    public void setCq(WorkQueue cq) {
        this.cq = cq;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getSecA() {
        return secA;
    }

    public void setSecA(String secA) {
        this.secA = secA;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    private User user;

    public String getU_name() {
        return U_name;
    }

    public void setU_name(String U_name) {
        this.U_name = U_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getSecQ() {
        return secQ;
    }

    public void setSecQ(String secQ) {
        this.secQ = secQ;
    }

    public String getPhNo() {
        return PhNo;
    }

    public void setPhNo(String PhNo) {
        this.PhNo = PhNo;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return U_name;
    }

}
