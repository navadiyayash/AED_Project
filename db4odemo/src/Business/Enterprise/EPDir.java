/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.RTO.RTO;
import static com.db4o.nativequery.NQDebug.LOG;
import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class EPDir {
    
    
    private ArrayList<Enterprise> epLst;
    
    public EPDir(){
    
        epLst = new ArrayList<Enterprise>();
        
    } 

    public ArrayList<Enterprise> getEpLst() {
        return epLst;
    }

    public void setEpLst(ArrayList<Enterprise> epLst) {
        this.epLst = epLst;
    }
   
    public Enterprise createAndAddEnterprise(String name,Enterprise.EPType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EPType.ServiceCenter){
            enterprise=new SCEnterprise(name);
            epLst.add(enterprise);
        }
        else if(type==Enterprise.EPType.User){
            enterprise=new UserEnterprise(name);
            epLst.add(enterprise);
        }
        else if(type==Enterprise.EPType.LoanComp){
            enterprise= new LoanComp(name);
            epLst.add(enterprise);}
        else if(type==Enterprise.EPType.RTO){
            System.out.print("\nName - " + name + " || " + "Type - " + type);
        enterprise=new RTO(name);
        epLst.add((enterprise));}
        System.out.print("RTOEnterprise - " + epLst.size());
        return enterprise;
    }
    
    
}
