/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;


import Business.Organizations.Organizations.Type;
import java.util.ArrayList;
//import Business.Organizations.Organizations;

/**
 *
 * @author yashn
 */
public class OrgDir {

    private ArrayList<Organizations> orgLst;

    public OrgDir() {
        orgLst = new ArrayList<Organizations>();
    }

    public ArrayList<Organizations> getOrgLst() {
        return orgLst;
    }

    public Organizations createOrganization(Type type) {
        Organizations o = null;
        if (type.getValue().equals(Type.Mechanic.getValue())) {
            o = new MechanicOrg();
            orgLst.add(o);
        } else if (type.getValue().equals(Type.Buyer.getValue())) {
            o = new BuyerOrg();
            orgLst.add(o);
        } else if (type.getValue().equals(Type.Seller.getValue())) {
            o = new SellerOrg();
            orgLst.add(o);
        } else if (type.getValue().equals(Type.LoanAgent.getValue())) {
            o = new LoanAgent();
            orgLst.add(o);
        }
        return o;
    }
}
