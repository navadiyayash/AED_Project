
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class LoanComp extends Enterprise{

    public LoanComp(String name) {
        super(name,EPType.LoanComp);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
