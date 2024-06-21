import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorld {

    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        String message = helloWorld.getMessage();
        assertEquals("Hello, World!", message);
    }
}
