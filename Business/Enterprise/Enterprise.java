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

//abstract classes can be subclassed 
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

    public enum EPType {
        ServiceCenter("Service Center"),User("User"),LoanComp("Loan Company"),RTO(" "); //Regional Traffic Office
//coming in dropdown for enterprise type
        private String value;

        private EPType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EPType getEPType() {
        return epType;
    }

    public void setEPType(EPType epType) {
        this.epType = epType;
    }

    public Enterprise(String name, EPType type) {
        super(name);
        this.epType = type;
        orgDir = new OrgDir();
        // enterpriseDir = new EnterpriseDirectory();
    }

//    public class getOrgDir {
//
//        public getOrgDir() {
//        }
//    }
}
