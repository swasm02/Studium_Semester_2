package PP_Uebung_2.Aufgabe5;

public class Bier extends alkoholischesGetraenk {
    String Brauerei;

    public Bier (String brauerei, int alk) {
        super(alk);
        this.Brauerei = brauerei;
    }

    public String getBrauerei () {
        return Brauerei;
    }

    public void setBrauerei(String brauerei) {
        Brauerei = brauerei;
    }
}
