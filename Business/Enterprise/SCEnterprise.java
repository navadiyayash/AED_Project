
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saneel
 */
public class SCEnterprise extends Enterprise{
    //added constructor
    public SCEnterprise(String name) {
        super(name, EPType.ServiceCenter);
    }//, EPType type
        @Override
        public ArrayList<Role> getSupportedRole() {
        return null;
    }
    }
    

    
    

