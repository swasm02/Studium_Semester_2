package PP_Uebung_2.Aufgabe2;
import java.util.Scanner;

public class Divider {
    public static void main(String[] args) throws DivideByZeroException {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scn.nextInt();
        System.out.print("Input b: ");
        int b = scn.nextInt();

        scn.close();

        System.out.println(divide(a,b));
    }

    public static double divide(int a, int b) throws DivideByZeroException {
        if (b == 0) throw new DivideByZeroException("Hilfe eine 0");
        return (a*1.0)/(b*1.0);
    }
}
