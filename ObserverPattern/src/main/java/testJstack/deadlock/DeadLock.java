package testJstack.deadlock;

/**
 * Create by mr.wl on 2017/8/31
 */

public class DeadLock implements Runnable {
    private Object obj1;
    private Object obj2;
    private int order;

    public DeadLock(int order, Object obj1, Object obj2) {
        this.order = order;
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void test1() throws InterruptedException {
        synchronized (obj1) {
            //建议线程调取器切换到其它线程运行
            Thread.yield();
            synchronized (obj2) {
                System.out.println("test。。。");
            }

        }
    }
    public void test2() throws InterruptedException {
        synchronized (obj2) {
            Thread.yield();
            synchronized (obj1) {
                System.out.println("test。。。");
            }

        }
    }

    @Override
    public void run() {

        while (true) {
            try {
                if(this.order == 1){
                    this.test1();
                }else{
                    this.test2();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


