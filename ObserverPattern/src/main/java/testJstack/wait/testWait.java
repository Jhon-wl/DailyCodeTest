package testJstack.wait;

/**
 * Create by mr.wl on 2017/8/31
 */
 public class testWait implements Runnable {
    @Override
    public void run() {

        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
