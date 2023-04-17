package PP__Woche_1;

public class Aufgabe3 {
    public long multiply(long[] numbers) {
        long aggr = 1;
        for (long i: numbers) {
            aggr *= i;
        }
        return aggr;
    }
}
