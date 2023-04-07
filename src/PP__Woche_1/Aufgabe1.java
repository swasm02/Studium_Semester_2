package PP__Woche_1;

/*
Erstellen Sie ein einfaches Hello-World-Programm, dass Ihren Namen einmal vorwärts und anschließend einmal rückwärts ausgibt.
Setzen Sie einen Breakpoint bei der Ausgabe des rückwärts geschriebenen Namen und starten Sie den Debugger.
Machen Sie anschließend einen Screenshot von der IDE, in der der aktiv angesprungene Breakpoint, der Programmcode und die Programmausgabe zu sehen ist.
Geben Sie das Bild ab.
*/

public class Aufgabe1 {
    public static void main(String[] args) {
        String name = "Stefan Wasmer";
        System.out.println(name);

        String eman = string_backwards(name);
        System.out.println(eman);
    }

    public static String string_backwards(String str) {
        String output = "";
        for (int i = str.length(); i > 0; i--) output += str.charAt(i - 1);
        return output;
    }
}