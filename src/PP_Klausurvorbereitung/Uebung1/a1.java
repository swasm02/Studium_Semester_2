package PP_Klausurvorbereitung.Uebung1;
import static org.junit.jupiter.api.Assertions.*;

class divide {
    public double divideNumbers(double a, double b) throws DivByZeroException {
        if (b == 0) {
            throw new DivByZeroException();
        }
        return a / b;
    }

    public boolean wahr() {
        return true;
    }
}

class DivByZeroException extends java.lang.Exception {
    public DivByZeroException() {
        super();
    }
}

public class a1 {
    @org.junit.jupiter.api.Test
    void a1() throws DivByZeroException {
        divide d = new divide();
        assertEquals(2, d.divideNumbers(4,2), 0.001);
        assertEquals(0, d.divideNumbers(0,4), 0.001);
        assertEquals(-3, d.divideNumbers(-9,3), 0.001);

        assertTrue(d.wahr());

        assertThrows(DivByZeroException.class, () -> {
            d.divideNumbers(4,0);
        });
    }
}
