package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.function.BooleanSupplier;

public class KataShould {

    @Test
    public void startWithAFailingTest() {
        Assertions.fail("start by implementing a test");
    }

    @Test
    void something() throws Exception {
        Assertions.assertTrue(false);
    }
    @Test
    void returnTrueSizeSup6() {
        Password password=new Password();
        Assertions.assertTrue(password.isSizeSup6("123ERRa2"));
    }

}
