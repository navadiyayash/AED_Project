package Business;

//import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAcc;
import com.db4o.User;

/**
 *
 * @author yashn
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
//        EcoSystem system = EcoSystem.getInstance();
//        
//        //Create a network
//        //create an enterprise
//        //initialize some organizations
//        //have some employees 
//        //create user account

EcoSystem system = EcoSystem.getInstance();
        
        Business.User.User user = system.getUserDirectory().createUser("AUTO");       
        
        UserAcc ua = system.getUserAccDir().createUserAccount("admin", "admin", user, new SystemAdminRole());
        
        return system;
    }
    
}
