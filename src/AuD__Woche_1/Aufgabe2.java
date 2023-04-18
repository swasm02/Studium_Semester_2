package AuD__Woche_1;
import java.util.Arrays;

public class Aufgabe2 {
    public static void main(String[] args) {
        int[] sommertage = {0,9,-20,4,5,-20,9,0};
        System.out.println(Arrays.toString(sommertage));
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
        System.out.println("First: " + a[i] + " Last: " + a[j]);
        return new int[] {i, j};
    }

}

class linked_list {
    private int i;
    private int j;
    private linked_list next;

    linked_list(int i, int j) {
        this.i = i;
        this.j = j;
        next = null;
    }
    linked_list() {
        i = -1; j = -1; next = null;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public int getJ() {
        return j;
    }
    public void setJ(int j) {
        this.j = j;
    }
    public linked_list getNext() {
        return next;
    }
    public void setNext(linked_list next) {
        this.next = next;
    }
    public String toString() {
        String s = "i: " + getI() + " j: " + getJ();
        while (next != null) {
            s += " | " + "i: " + next.getI() + " j: " + next.getJ();
            next = getNext();
        }
        return s;
    }
}