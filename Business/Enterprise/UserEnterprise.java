
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class UserEnterprise extends Enterprise {
    public UserEnterprise(String name){
        super(name,Enterprise.EPType.User);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}


