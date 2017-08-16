package CodeOnline5.TestThread;

/**
 * Create by mr.wl on 2017/8/16
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i<100 ; i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%10==0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
