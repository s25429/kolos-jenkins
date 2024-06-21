import org.junit.Test;
import static org.junit.Assert.assertEquals;

import HelloWorld;

public class HelloWorldTest {

    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        String message = helloWorld.getMessage();
        assertEquals("Hello, World!", message);
    }
}
