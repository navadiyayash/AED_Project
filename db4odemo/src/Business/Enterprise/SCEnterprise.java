
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class SCEnterprise extends Enterprise{

    public SCEnterprise(String name){
        super(name,EPType.ServiceCenter);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    
    
}
