
package Business.LoanComp;

import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class LoanDirectory {
        private ArrayList<LoanAgent>LoanCompanies;

         public LoanDirectory() {
        LoanCompanies= new ArrayList<LoanAgent>();
    }
         
          public ArrayList<LoanAgent> getLoanCompanies() {
        return LoanCompanies;
    }
         public LoanAgent createCompany()
    {
        LoanAgent n =new LoanAgent();
        LoanCompanies.add(n);
        return n;
    }
}
