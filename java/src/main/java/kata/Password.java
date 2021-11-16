package kata;

public class Password {
    
    public boolean isValid(String password, boolean isAdmin) {
        isAdmin=true;
        return password.matches(".*\\d.*") && password.length()>=6 && password.matches(".*[a-zA-Z].*");
    }

}
