package PP_Uebung_2.Aufgabe5;

public class FlascheGen<G extends Getraenk> {
    G inhalt;

    public Getraenk getInhalt() {
        return inhalt;
    }

    public void setInhalt(G inhalt) {
        this.inhalt = inhalt;
    }
}
