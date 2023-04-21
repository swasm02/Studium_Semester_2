package PP_Uebung_2.Aufgabe4;

public class Kaefig<T extends Tier> {
    private T tier;
    private boolean voll = false;

    public Kaefig(T tier) {
        this.tier = tier;
        voll = true;
    }

    public Kaefig() {
        voll = false;
    }

    public void insertInto(T tier) {
        if (voll) System.out.println("schon besetzt");
        else {
            this.tier = tier;
        }
    }

    public static void main(String[] args) {
        Kaefig<Tier> leer = new Kaefig<>();
        leer.insertInto(new Elefant());

        Kaefig<Elefant> ele = new Kaefig<>(new Elefant());

        Kaefig<?> wildcard;
        wildcard = new Kaefig<Spatz>();
    }
}
