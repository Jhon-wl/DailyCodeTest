package testJstack.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Create by mr.wl on 2017/8/31
 */

public class test {

    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();

        ExecutorService ex = Executors.newFixedThreadPool(10);
        // 起10个线程
        for (int i = 0; i < 10; i++) {
            int order = i%2==0 ? 1 : 0;
            ex.execute(new DeadLock(order, obj1, obj2));
        }

    }
}
