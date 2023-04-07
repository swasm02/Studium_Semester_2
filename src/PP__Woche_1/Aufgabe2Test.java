package PP__Woche_1;
import static org.junit.jupiter.api.Assertions.*;
class Aufgabe2Test {
    @org.junit.jupiter.api.Test
    void div() {
        Aufgabe2 d = new Aufgabe2();
        assertEquals(d.divideNumbers(4,2),2, "should work");
        assertEquals(d.divideNumbers(8,2),4, "should work");
        assertEquals(d.divideNumbers(6,2),2,"should explode");
    }
}