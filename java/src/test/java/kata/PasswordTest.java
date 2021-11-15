package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.function.BooleanSupplier;

public class PasswordTest {

    @Test
    void returnTrueSizeSup6() {
        Password password=new Password();
        Assertions.assertTrue(password.isSizeSup6("123ERRa2"));
        Assertions.assertFalse(password.isSizeSup6("123E2"));
    }

}
