package PP_Klausurvorbereitung;
import java.lang.Thread;
import java.lang.Runnable;

public class HeartBeat2 extends Thread {
    int pulse = 1000;

    public HeartBeat2() {}
    public void setPulse(int p) { pulse = p * 1000; }

    public HeartBeat2(int i) {
        pulse = i * 1000;
    }

    public void run() {
        while(true) {
            try { Thread.sleep(pulse); }
            catch(InterruptedException e) {}
            System.out.println("poch");
        }
    }


    <T extends Object> boolean contains (T a) {
        // stuff
        return true;
    }

    public static void main(String[] args) {
        /*HeartBeat2 t = new HeartBeat2(2);
        t.start();
*/
        Runnable task = () -> { // Java way of declaring Lambdas
            String me = Thread.currentThread().getName();
            System.out.println("Hallo " + me);
        };
        task.run(); // not parallel: runs in same thread
        Thread thread = new Thread(task);
        thread.start(); // calls task.run() in new thread
    }
}
