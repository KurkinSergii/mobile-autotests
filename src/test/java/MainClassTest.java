import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assertions.assertEquals(14, mainClass.getLocalNumber(), "Recieved value is not equal 14");
    }
}
