package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    void returnTrueSizeSup6() {
        Password password=new Password();
        Assertions.assertTrue(password.isValid("123ERRa2"));
        Assertions.assertFalse(password.isValid("123E2"));
    }

    
    @Test
    void returnTrueContainsDigit() {
        Password password=new Password();
        Assertions.assertTrue(password.isChecked("123ERRa2"));
    }

    
    
}
