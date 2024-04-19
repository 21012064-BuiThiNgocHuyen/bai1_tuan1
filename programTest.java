import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {
    @Test
    public void testEvenNumber() {
        String result = Program.checkEvenOdd(2);
        assertEquals("2 la so chan", result);
    }

    @Test
    public void testOddNumber() {
        String result = Program.checkEvenOdd(3);
        assertEquals("3 la so le", result);
    }

    
}