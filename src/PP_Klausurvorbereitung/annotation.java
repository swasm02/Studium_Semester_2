package PP_Klausurvorbereitung;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Steve")
public class annotation {

    @Author(name = "Sab")
    public String testi;

    public static void main(String[] args) {
        for (Annotation a : annotation.class.getDeclaredAnnotations()) {
            System.out.println(a);
        }
    }
}