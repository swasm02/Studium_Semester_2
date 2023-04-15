package AuD__Woche_1;

import java.util.Arrays;

public class Aufgabe2 {
    public static void main(String[] args) {
        int[] sommertage = {99, -9, 5, -1, 12, -101, 100};
        System.out.println(Arrays.toString(sommertage));
        System.out.println(Arrays.toString(SummerLin(sommertage)));
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

            if (maxsum < maxendsum) {
                maxsum = maxendsum;
                i = maxendind;
                j = l;
            }
        }

        return new int[] {i, j};
    }
}
