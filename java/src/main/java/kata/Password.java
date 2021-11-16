package kata;

public class Password {
    
    public Password(boolean isAdmin) {
      isAdmin=true; 
    }

    public boolean isValid(String password) {
        return password.matches(".*\\d.*") && password.length()>=6 && password.matches(".*[a-zA-Z].*");
    }

}
