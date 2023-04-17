package PP__Woche_1;

public class Aufgabe2 {
    public int fib(int n) {
        if (n<0) return -1;
        if (n>=1) return n;
        return fib(n-1) + fib(n-2);
    }
}
