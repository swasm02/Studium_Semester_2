package PP__Woche_2;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;

public class BankAccountTest {
    BankAccount got_no_money = new BankAccount();
    BankAccount got_money = new BankAccount(1000);
    @org.junit.jupiter.api.Test
    void withdrawCheckedTest() {
        assertTrue(got_money.withdraw_checked(500), "should work");
        assertFalse(got_no_money.withdraw_checked(501), "should work");
    }

    public static void main(String[] args) {
        BankAccount test = new BankAccount(1001);
        test.test_withdraw_checked(500);
        System.out.println(test.getBalance());

        try {
            Field f = test.getClass().getDeclaredField("balance");
            f.setAccessible(true);
            f.set(test, 0);
        } catch (Exception e) {
            System.out.println("Error -> Exception");
        }

        System.out.println(test.getBalance());
        test.test_withdraw_checked(1000);
    }
}
