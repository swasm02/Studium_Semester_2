package PP_Klausurvorbereitung.Uebung1;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;

public class a2 {
    private int balance = 0;
    private int limit = -500;

    private void addToBalance(int amount) {
        balance += amount;
    }

    private void subFromBalance(int amount) throws Exception {
        if (balance - amount >= limit) {
            balance -= amount;
        } else {
            throw new Exception("ueberzogen");
        }
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int i) {
        addToBalance(i);
    }
    public void withdraw(int i) throws Exception {
        subFromBalance(i);
    }
}

class Test {
    @org.junit.jupiter.api.Test
    public void testing_a() {
        a2 test = new a2();
        try {
            Method m = test.getClass().getDeclaredMethod("subFromBalance", int.class);
            m.setAccessible(true);
            m.invoke(test, 1000);

            if (test.getBalance() < 0) throw new Exception("negativ");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    public void testing_b() {
        a2 test = new a2();

        try {
            Method m = test.getClass().getDeclaredMethod("subFromBalance", int.class);
            m.setAccessible(true);
            assertThrows(Exception.class, () -> {
                m.invoke(test, 5001);
            });
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    public void testing_c() {
        a2 test = new a2();

        try{
            Field f = test.getClass().getDeclaredField("limit");
            f.setAccessible(true);
            f.set(test, -200);

            Method m = test.getClass().getDeclaredMethod("subFromBalance", int.class);
            m.setAccessible(true);
            assertThrows(Exception.class, () -> {
                m.invoke(test, 201);
            });

        } catch(Exception e) {
            System.out.println(e);
        }
    }


}