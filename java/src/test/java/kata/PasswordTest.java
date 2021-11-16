package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        Assertions.assertTrue(password.isValid("12t4562"));
        Assertions.assertFalse(password.isValid("1263456"));
    }
    @Test
    void returnTrueContainsCaracter() {
    	Password password=new Password();
    	Assertions.assertTrue(password.isValid("DF56SII"));
    	Assertions.assertTrue(password.isValid("DF59SII"));
    	Assertions.assertFalse(password.isValid("DFyfSII"));
    	Assertions.assertFalse(password.isValid("hello1"));
    	Assertions.assertFalse(password.isValid("HELLPPP"));
    	Assertions.assertFalse(password.isValid("12345678"));
    }

    @Test
    void testsDuPO() throws Exception {
        Password password=new Password();
        Assertions.assertTrue(password.isValid("bonjour1"));
        Assertions.assertTrue(password.isValid("HEELLO1"));
        Assertions.assertTrue(password.isValid("TéDéDé1"));
        Assertions.assertTrue(password.isValid("123456éa"));

    }

    @ParameterizedTest
    @ValueSource(strings = {"Aonjour1?98","Aonjour?81","Aon#jour%81"})
    void testPasswordAdminOK(String passwordStr) throws Exception {
        Password password=new Password();
        Assertions.assertTrue(password.isAdminValid(passwordStr));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"Aonjour81","Aonjour#"})
    void testPasswordAdminNOK(String passwordStr) throws Exception {
        Password password=new Password();
        Assertions.assertFalse(password.isAdminValid(passwordStr));
    }
    
    @Test
    void test() throws Exception {
        Password password=new Password();
        org.assertj.core.api.Assertions.assertThat(password.isPwdAdminValid("Aonjour81A;")).isEmpty();

    }
       
}
