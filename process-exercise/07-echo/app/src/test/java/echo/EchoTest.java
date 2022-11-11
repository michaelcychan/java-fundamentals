package echo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EchoTest {

    // Backup original System.out
    private final PrintStream standardOut = System.out;

    // Create an Output System Stream to catch STDOUT
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        // Replace STDOUT with the captor
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testInitialGreeting() {
        System.out.print("Say Something");
        assertEquals("Say Something", outputStreamCaptor.toString());
    }

    @After
    public void tearDown() {
        // Restore original STDOUT
        System.setOut(standardOut);
    }

}
