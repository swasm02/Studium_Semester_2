package PP_Uebung_2.Aufgabe5;

public class alkoholischesGetraenk extends Getraenk {
    protected int alkoholgehalt;

    public alkoholischesGetraenk(int alkoholgehalt) {
        this.alkoholgehalt = alkoholgehalt;
    }

    public int getAlkoholgehalt() {
        return alkoholgehalt;
    }
}
