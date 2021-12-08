package Business;

//import Business.Employee.Employee;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAcc;
import com.db4o.User;

/**
 *
 * @author yashn
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        

EcoSystem system = EcoSystem.getInstance();
        
        Business.User.User user = system.getUserDir().createUser("AUTO");       
        
        UserAcc ua = system.getUserAccDir().createUserAcc("admin", "admin", user, new SysAdminRole());
        
        return system;
    }
    
}
