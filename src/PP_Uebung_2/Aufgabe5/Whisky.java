package PP_Uebung_2.Aufgabe5;

public class Whisky extends alkoholischesGetraenk {
    String Distille;

    public Whisky(int alkoholgehalt) {
        super(alkoholgehalt);
    }

    public String getDistille() {
        return Distille;
    }
}
