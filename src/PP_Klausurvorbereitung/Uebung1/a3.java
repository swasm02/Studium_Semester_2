package PP_Klausurvorbereitung.Uebung1;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Feld {
    String since();
    String desc();
}

@Feld(since="anytime", desc="no")
public class a3 {
    @Feld(since="today", desc = "dumm?")
    public String name;

    @Feld(since="yesterday", desc="blöd?")
    public String jahr;

    public static void main(String[] args) {
        for (Annotation a : a3.class.getDeclaredAnnotations()) {
            System.out.println(a);
        }

        Field[] felder = a3.class.getDeclaredFields();

        for (Field f : felder) {
            f.setAccessible(true);
            for (Annotation a : f.getDeclaredAnnotations()) {
                System.out.println(a);
            }
        }
    }
}