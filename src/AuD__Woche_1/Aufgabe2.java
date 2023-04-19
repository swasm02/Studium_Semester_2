package AuD__Woche_1;
import java.util.Arrays;

public class Aufgabe2 {
    public static void main(String[] args) {
        int[] sommertage = {0,10,-20,11,-20,9,0};
        System.out.println("zu überprüfendes Jahr: " + Arrays.toString(sommertage));
        System.out.println("Sommerperiode: " + Arrays.toString(SummerLin(sommertage)));
        System.out.println("Südsommerperiode: " + Arrays.toString(south_summer_period(sommertage)));
    }

    public static int[] SummerLin(int[] a) {
        int maxsum = Integer.MIN_VALUE;
        int maxendsum = Integer.MIN_VALUE;
        int maxendind = -1; int i = -1; int j = -1;

        for (int l = 0; l < a.length; l++) {
            if (a[l] > maxendsum + a[l]) {
                maxendind = l;
                maxendsum = a[l];
            } else {
                maxendsum = maxendsum + a[l];
            }

            if (maxsum <= maxendsum) {
                maxsum = maxendsum;
                i = maxendind;
                j = l;
            }
        }
        //System.out.println("First: " + a[i] + " Last: " + a[j]);
        return new int[] {i, j};
    }

    public static int[] south_summer_period(int[] a) {
        int maxsum = Integer.MIN_VALUE;
        int maxendsum = Integer.MIN_VALUE;
        int maxendind = -1; int i = -1; int j = -1;

        for (int l = 0; l < 2 * a.length; l++) {
            int c = l % a.length;
            if (a[c] > maxendsum + a[c]) {
                maxendind = c;
                maxendsum = a[c];
            } else {
                maxendsum = maxendsum + a[c];
            }

            if (maxsum <= maxendsum) {
                maxsum = maxendsum;
                i = c;
                j = maxendind;
            }
        }
        //System.out.println("First: " + a[j] + " Last: " + a[i]);
        return new int[] {j, i};
    }
}