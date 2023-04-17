package PP__Woche_2;
import static org.junit.jupiter.api.Assertions.*;

public class Aufgabe1Test {
    @org.junit.jupiter.api.Test
    void div() {
        Aufgabe1 test = new Aufgabe1();

        //positive Werte
        assertEquals(test.divideNumbers(4,2),2);

        //negative Werte
        assertEquals(test.divideNumbers(-4,2),-2);
        assertEquals(test.divideNumbers(4,-2), -2);
        assertEquals(test.divideNumbers(-4,2), -2);

        //Null
        assertEquals(test.divideNumbers(4,0), Double.POSITIVE_INFINITY);
        assertEquals(test.divideNumbers(-4,0), Double.NEGATIVE_INFINITY);
        assertEquals(test.divideNumbers(0,0), Double.NaN);
    }
}
