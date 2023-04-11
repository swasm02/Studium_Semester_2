package PP__Woche_2;
import static org.junit.jupiter.api.Assertions.*;

public class Aufgabe1Test {
    @org.junit.jupiter.api.Test
    void div() {
        Aufgabe1 test = new Aufgabe1();

        //positive Werte
        assertEquals(test.divideNumbers(4,2),2, "should work");

        //negative Werte
        assertEquals(test.divideNumbers(-4,2),-2, "should work");

        //Null
        assertEquals(test.divideNumbers(4,0),0, "should not work ;(");
    }
}
