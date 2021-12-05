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
 * @author yashn
 */
public abstract class Enterprise extends Organizations {
    
        private OrgDir orgdir;
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
    orgdir=new OrgDir();
   // enterpriseDir = new EnterpriseDirectory();
    }
}
