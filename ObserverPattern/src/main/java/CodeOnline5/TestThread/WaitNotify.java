package CodeOnline5.TestThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Create by mr.wl on 2017/8/16
 */
public class WaitNotify implements Runnable{

    private int weight = 5;
    private static Object lock = new Object();


    public void run() {
        synchronized (lock){

            while (weight-- > 0){
                try {
                    lock.notify();
                    System.out.println(weight);
                    lock.wait();
                    System.out.println(Thread.currentThread().getName()+"获得锁,执行wait后面的代码"+weight);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }
    }
}
