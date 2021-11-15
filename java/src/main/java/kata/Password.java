package kata;

import java.util.function.BooleanSupplier;

public class Password {

    public boolean isValid(String password) {
        return password.length()>=6;
    }

}
