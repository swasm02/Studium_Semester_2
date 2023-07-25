package PP_Klausurvorbereitung;
import java.lang.reflect.*;

class Test {
    private String name;

    private String method(String a) {
        System.out.println(a);
        return a;
    }
}


public class reflections {
    public static void main(String[] args) {
        Test lol = new Test();

        try {
            Field f = lol.getClass().getDeclaredField("name");
            f.setAccessible(true);
            f.set(lol, "new");

            Method m = lol.getClass().getDeclaredMethod("method", String.class);
            m.setAccessible(true);
            m.invoke(lol, "new");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
