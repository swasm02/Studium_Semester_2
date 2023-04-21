package PP_Uebung_2.Aufgabe3;

public class MyClass<T> {
    // factory pattern (eine Methode, die ein Instanz der Klasse erzeugt)
    static Object createMagicObject() {
        return new MyClass<String>();
    }
    // main Methode (Hinweis: main-Methoden dürfen in jedweder Klasse stehen)
    public static void main(String[] args) {
        MyClass<String> myArray = (MyClass<String>)createMagicObject();
    }
}