package CodeOnline5.TestThread;


import org.junit.Test;

/**
 * Create by mr.wl on 2017/8/16
 */
public class ThreadMain {
    @Test
    //测试继承Thread
    public void test(){

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
    }

    @Test
    //测试实现Runnnable
    public void  test1(){
        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();
        new Thread(r1,"thr1").start();
        new Thread(r2,"thr2").start();

    }

    @Test
    //测试interrupt()
    public void test2() throws InterruptedException {
        MyInterrupt r1 = new MyInterrupt();
        Thread thread =new Thread(r1,"A");
        thread.start();
        Thread.sleep(6000);
        thread.interrupt();

    }

    @Test
    //测试join方法
    public void test3() throws InterruptedException {
        MyRunnable r1 = new MyRunnable();
        Thread thread =new Thread(r1,"A");
        thread.start();
        thread.join();
        System.out.println("我是主线程");
    }

    @Test
    //测试yield方法
    public void test4(){
        MyRunnable m1 = new MyRunnable();
        Thread thread = new MyThread();
        new Thread(m1,"Run线程").start();
        thread.start();
        for (int i=0;i<100 ;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我是主线程");
        }
    }

    @Test
    public void Test5(){
        WaitNotify wn = new WaitNotify();
        WaitNotify wn2 = new WaitNotify();
        new Thread(wn,"我是A线程").start();
        new Thread(wn2,"我是B线程").start();
    }
}
