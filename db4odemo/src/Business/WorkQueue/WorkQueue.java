/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class WorkQueue {
        private ArrayList<WorkRequest> workReqLst; //workRequestList

    public WorkQueue() {
        workReqLst = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkReqLst() {
        return workReqLst;
    }
}
