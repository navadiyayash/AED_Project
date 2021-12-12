/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAcc;
import java.util.Date;


/**
 *
 * @author harsh
 */
public abstract class WorkRequest {
    private String msg;   //message
    private String status;
    private String Role;
    private UserAcc sender;
    private UserAcc receiver;
    private Date reqDate; //request
    private Date resDate; //resolve
//    private String status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public UserAcc getSender() {
        return sender;
    }

    public void setSender(UserAcc sender) {
        this.sender = sender;
    }

    public UserAcc getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAcc receiver) {
        this.receiver = receiver;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getResDate() {
        return resDate;
    }

    public void setResDate(Date resDate) {
        this.resDate = resDate;
    }
    
    @Override
    public String toString() {
        return getSender().getU_name();
    }
    
    
}
