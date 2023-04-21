package PP_Uebung_2.Aufgabe5;

public class teilaufgabe3 {
    public static void main(String[] args) {
        Kasten bier = new Kasten();
        Kasten cola = new Kasten();
        Kasten alkohol = new Kasten();
        Kasten gemischt = new Kasten();

        //Error:
        //Cannot invoke "PP_Uebung_2.Aufgabe5.Flasche.setInhalt(PP_Uebung_2.Aufgabe5.Getraenk)" because bier.flaschen[i] is null
        //Keine Ahnung man das fixen kann
        for (int i = 0; i < 16; i++) {
            bier.flaschen[i].setInhalt(new Bier("Rothaus", 7));
            cola.flaschen[i].setInhalt(new Cola(1.5));
            if (i > 6) alkohol.flaschen[i].setInhalt(new Whisky(44));
                else alkohol.flaschen[i].setInhalt(new Wein(10));
            if (i > 9) gemischt.flaschen[i].setInhalt(new Cola(3.0));
                else if (i > 6) gemischt.flaschen[i].setInhalt(new Wein(10));
                else if (i > 3) gemischt.flaschen[i].setInhalt(new Wasser());
                else gemischt.flaschen[i].setInhalt(new Whisky(57));
        }

        Bier schleifenbier;
        Cola schleifencola;
        alkoholischesGetraenk schleifenalk;

        for (int i = 0; i < 16; i++) {
            schleifenbier = (Bier) bier.flaschen[i].getInhalt();
            System.out.println(schleifenbier.getBrauerei());
            System.out.println(schleifenbier.getAlkoholgehalt());

            schleifencola = (Cola) cola.flaschen[i].getInhalt();
            System.out.println(schleifencola.getZucker());

            schleifenalk = (alkoholischesGetraenk) alkohol.flaschen[i].getInhalt();
            System.out.println(schleifenalk.getAlkoholgehalt());

            /*if (gemischt.flaschen[i].getInhalt() == alkoholischesGetraenk) {
                System.out.println(gemischt.flaschen[i].getInhalt()); //Alkoholgehalt
            }*/
        }
    }
}
