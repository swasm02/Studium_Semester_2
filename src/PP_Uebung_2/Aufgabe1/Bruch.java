package PP_Uebung_2.Aufgabe1;
import java.util.Objects;

public class Bruch {
    public int getDivisor() {
        return divisor;
    }

    public int getDivident() {
        return divident;
    }

    public Bruch(int d1, int d2) {
        divident = d1;
        divisor = d2;
        normalize();
    }

    void isValid(int d1, int d2) {
        int ggt = ggT(d1, d2);

        assert(ggt == 1);
    }

    public Bruch add(Bruch b) {
        isValid(divisor,  divident);
        isValid(b.divisor,  b.divident);
        int divis = getDivisor()*b.getDivident() + getDivident()*b.getDivisor();
        int divid = getDivisor()*b.getDivisor();

        isValid(divis, divid);
        return new Bruch(divis, divid);
    }

    public Bruch sub(Bruch b) {
        isValid(divisor,  divident);
        isValid(b.divisor,  b.divident);
        Bruch end = add(new Bruch(-b.getDivident(), b.getDivisor()));
        isValid(end.divisor, end.divident);
        return end;
    }

    public Bruch mul(Bruch b) {
        isValid(divisor,  divident);
        isValid(b.divisor,  b.divident);
        Bruch end = new Bruch(getDivisor()*b.getDivisor(), getDivident()*b.getDivident());
        isValid(end.divisor, end.divident);
        return end;
    }

    public Bruch div(Bruch b) {
        isValid(divisor,  divident);
        isValid(b.divisor,  b.divident);
        Bruch end = new Bruch(getDivisor()*b.getDivident(), getDivident()*b.getDivisor());
        isValid(end.divisor, end.divisor);
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bruch bruch = (Bruch) o;
        return divisor == bruch.divisor &&
                divident == bruch.divident;
    }

    @Override
    public int hashCode() {
        return Objects.hash(divisor, divident);
    }

    private void normalize() {
        if (divisor == divident ||-divisor == divident) {
            divisor = 1;
            divident = 1;
        } else {
            int ggT = ggT(divisor, divident);
            divident /= ggT;
            divident /= ggT;
        }
    }

    private int ggT(int a, int b) {
        return a == 0 ? b : ggT(b % a, a);
    }

    private int divisor;
    private int divident;
}