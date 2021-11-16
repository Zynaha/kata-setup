package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    void returnTrueSizeSup6() {
        Password password=new Password();
        Assertions.assertTrue(password.isValid("123Ef56"));
        Assertions.assertFalse(password.isValid("123E2"));
    }

    
    @Test
    void returnTrueContainsDigit() {
        Password password=new Password();
        Assertions.assertTrue(password.isValid("12t456"));
        Assertions.assertFalse(password.isValid("1263456"));
    }
    @Test
    void returnTrueContainsCaracter() {
    	Password password=new Password();
    	Assertions.assertTrue(password.isValid("DF56SII"));
    	Assertions.assertTrue(password.isValid("DF59SII"));
    	Assertions.assertFalse(password.isValid("DFyfSII"));
    	Assertions.assertFalse(password.isValid("hello1"));
    }

    @Test
    void testsDuPO() throws Exception {
        Password password=new Password();
        Assertions.assertTrue(password.isValid("bonjour1"));
        Assertions.assertTrue(password.isValid("HEELLO1"));
        Assertions.assertTrue(password.isValid("TéDéDé1"));
        Assertions.assertTrue(password.isValid("123456éa"));

    }
    
}