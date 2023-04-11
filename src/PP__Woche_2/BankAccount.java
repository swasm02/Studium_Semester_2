package PP__Woche_2;

/*
a) In der Realität ermöglichen Banken bei üblichen Girokonten eine Überziehung in Form eines Dispokredits.
    Fügen Sie zur Klasse `BankAccount` eine private Member-Variable limit (int) hinzu, die im Konstruktor gesetzt wird
    und mittels einer Methode getLimit (public) ausgelesen werden kann.
    Zur Einfachheit nehmen wir hier ein festes Limit von 500,00 EUR an.

b) Erstellen Sie eine Methode withdrawChecked, die eine Abbuchung nur vornimmt, wenn der Dispokredit nicht überzogen wird
    (Invariante balance >= limit). Schreiben Sie außerdem einen Unit-Test, der die Einhaltung der Invariante in testWithdrawChecked prüft.

c) Alternativ lässt sich die Invariante direkt in der Methode subFromBalance unterbringen.
    Der direkte Test erfordert in diesem Fall die Nutzung von Reflections. Schreiben Sie nun einen Unit-Test,
    der die Einhaltung der Invariante in testWithdrawChecked prüft.

Tipp: Die Reflections-API stellt unter anderem die Methoden getDeclaredMethod, setAccessible und invoke bereit.
 */

public class BankAccount {
    private int balance; // unit: EUR

    private void addToBalance(int i) {
        balance += i;
    }

    private void subFromBalance(int i) {
        balance -= i;
    }

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(int i) {
        balance = i;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int i) {
        addToBalance(i);
    }

    public void withdraw(int i) {
        subFromBalance(i);
    }
}