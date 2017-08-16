package CodeOnline5.TestThread;

/**
 * Create by mr.wl on 2017/8/16
 */
public class MyInterrupt implements Runnable{

    public void run() {
        for (int i = 0; i<10 ; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();

            }
            if(Thread.currentThread().isInterrupted()){
                break;
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
