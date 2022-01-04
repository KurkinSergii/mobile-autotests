import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assertions.assertEquals(14, mainClass.getLocalNumber(), "Recieved value is not equal 14");
    }

    @Test
    public void testGetClassNumber() {
        Assertions.assertTrue(mainClass.getClassNumber() > 45, "The value that has been recieved from function 'getClassNumber' is less than 45");
    }
}
