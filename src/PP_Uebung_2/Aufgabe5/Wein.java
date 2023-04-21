package PP_Uebung_2.Aufgabe5;

public class Wein extends alkoholischesGetraenk {
    String Rebsorte;

    public Wein(int alkoholgehalt) {
        super(alkoholgehalt);
    }

    public String getRebsorte() {
        return Rebsorte;
    }
}
