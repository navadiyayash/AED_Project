/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organizations.OrgDir;
import Business.Organizations.Organizations;

/**
 *
 * @author saneel
 */
public abstract class Enterprise extends Organizations {
    
        private OrgDir orgDir;

    public OrgDir getOrgDir() {
        return orgDir;
    }

    public void setOrgDir(OrgDir orgDir) {
        this.orgDir = orgDir;
    }

    public EPType getEpType() {
        return epType;
    }

    public void setEpType(EPType epType) {
        this.epType = epType;
    }
        private EPType epType;

     public enum EPType{
        ServiceCenter("Service center"),User("User"),LoanComp("Loan company");
        
        private String value;
        
        private EPType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
     
     public EPType getEPType() {
        return epType;
    }
     public void setEPType(EPType epType) {
        this.epType = epType;
    }
     
     public Enterprise(String name,EPType type){
    super(name);
    this.epType=type;
    orgDir=new OrgDir();
   // enterpriseDir = new EnterpriseDirectory();
    }
}
