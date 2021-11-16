package kata;

import java.util.function.BooleanSupplier;

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

}
