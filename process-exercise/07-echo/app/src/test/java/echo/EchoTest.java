package echo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EchoTest {

    // Backup original System.out and System.in
    private final PrintStream standardOut = System.out;
    private final InputStream standardIn = System.in;

    // Create an Output System Stream to catch STDOUT
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputStreamSimulator = new ByteArrayInputStream("My Input".getBytes());

    @Before
    public void setUp() {
        // Replace STDOUT with the captor
        System.setOut(new PrintStream(outputStreamCaptor));
        System.setIn(inputStreamSimulator);
    }

    @Test
    public void testInitialGreeting() {
        Echo echo = new Echo();
        echo.getEcho();
        assertEquals("Say Something.", outputStreamCaptor.toString().trim());

        Scanner scanner = new Scanner(inputStreamSimulator);
        scanner.nextLine();
        scanner.close();
        assertEquals("My Input", outputStreamCaptor.toString().trim());
    }

    @After
    public void tearDown() {
        // Restore original STDOUT and STDIN
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

}
