package kata;

import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;

public class Password {
    
    public boolean isValid(String password) {
        return password.matches(".*\\d.*") && password.length()>6 && password.matches(".*[a-zA-Z].*");
    }

    public boolean isAdminValid(String password) {
        return password.matches(".*\\d.*") 
            && password.length()>=10 
            && password.matches(".*[a-zA-Z].*")
            && password.matches(".*[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-].*") ;
    }

    /*public List<String> isPwdAdminValid(String string) {
        // TODO Auto-generated method stub
        return null;
    }*/

//    public List<? extends String> isPwdAdminValid(String string) {
//        // TODO Auto-generated method stub
//        return null;
//    }

}
