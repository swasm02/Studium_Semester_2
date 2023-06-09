package PP__Uebung_1;
import java.lang.annotation.*;
import java.util.Scanner;

/*
Aufgabe 3
a) Erstellen Sie eine einfache Klasse Person und fügen ihr Attribute für z.B. Vorname, Nachname, Geburtsjahr, Geburtsort, usw. hinzu.
Stellen Sie sich hierbei vor, dass zunächst nur der Vorname implementiert und anschließend mit der Zeit zunehmend mehr Attribute hinzugefügt wurden.
Um anzugeben, ab welcher Version ein Attribut hinzugekommen ist, sollen Sie eine eigene Annotation Field mit dem Parameter availableSince vom Typ String
und einer Beschreibung description vom Typ String einführen.
Annotieren Sie Ihre Attribute so, dass erkennbar wird, seit wann welche Attribute verfügbar sind (z.B. der Vorname seit 1.0 und der Nachname in Version 1.0.1).
Geben Sie zusätzlich für jedes Attribut eine kurze aber aussagekräftige Beschreibung im description Feld an.

b) Erstellen Sie nun Ihr Hauptprogramm.
Dieses soll Benutzereingaben einlesen und aus diesen Eingaben neue Personen erzeugen.
Damit der Benutzer weiß, welchen Wert er gerade eingibt, nutzen Sie die Beschreibungen aus den Annotationen.
Geben Sie zusätzlich jeweils aus, seit welcher Version das Attribut verfügbar ist.

Hinweis: Für die Eingabe müssen Sie zunächst eine "leere" Person erzeugen und dann auf die darin enthaltenen annotierten Felder zugreifen.
Die Implementierung soll so auch für erweiterte, spätere Versionen der Klasse Person funktionieren.

Für die Eingabe können Sie dieses Beispielprogramm benutzen: https://www.w3schools.com/java/java_user_input.asp
 */

public class Person {
    @Retention(RetentionPolicy.RUNTIME)
    @interface information {
        String version();
        String description();
    }

    @information(version = "1.0.0", description = "Vorname der Person")
    public String Vorname;

    @information(version = "1.0.1", description = "Nachname der Person")
    public String Nachname;

    @information(version = "1.0.2", description = "Das Jahr, in welchem die Person geboren wurde.")
    public int Geburtsjahr;

    @information(version = "1.0.3", description = "Der Ort, in dem die Person geboren wurde.")
    public String Geburtsort;

    public static void main(String[] args) {
        try (Scanner scn = new Scanner (System.in)) {
            Person x = new Person();
            java.lang.reflect.Field[] fields = x.getClass().getDeclaredFields();
            for (java.lang.reflect.Field f : fields) {
                Annotation an = f.getDeclaredAnnotations()[0];
                System.out.println();
                System.out.println(((Person.information) an).description());
                System.out.println(((Person.information) an).version());

                if (f.getType() == String.class) {
                    f.set(x, scn.nextLine());
                } else if (f.getType() == int.class) f.setInt(x, Integer.parseInt(scn.nextLine()));
            }
        } catch(Exception e) {
            System.out.println("ERROR");
        }

    }
}
