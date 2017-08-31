package testJstack.wait;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Create by mr.wl on 2017/8/31
 */
public class TestTask {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(1);
        ex.execute(new testWait());
    }
}
