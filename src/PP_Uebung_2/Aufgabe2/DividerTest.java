package PP_Uebung_2.Aufgabe2;
import static org.junit.jupiter.api.Assertions.*;

public class DividerTest {
    @org.junit.jupiter.api.Test
    void divide() throws DivideByZeroException {
        assertEquals((3*1.0)/4, Divider.divide(3,4));

        boolean flag = false;
        try  {
            Divider.divide(5,0);
        } catch (DivideByZeroException e) {
            System.out.println("Hilfe");
            flag = true;
        }
        assertTrue(flag);

        // besser:
        assertThrows(DivideByZeroException.class, () -> {
            Divider.divide(2,0);
        });
    }
}
