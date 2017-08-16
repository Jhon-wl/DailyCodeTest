package thread;

/**
 * Created by mr.w on 2017/6/21.
 * 执行start（）的顺序，不代表线程启动的顺序
 */
public class TestMyThread1 {
    public static void main(String[]args){
        MyThread1 myThread1 = new MyThread1(1);
        MyThread1 myThread2 = new MyThread1(2);
        MyThread1 myThread3 = new MyThread1(3);
        MyThread1 myThread4 = new MyThread1(4);
        MyThread1 myThread5 = new MyThread1(5);
        MyThread1 myThread6 = new MyThread1(6);
        MyThread1 myThread7 = new MyThread1(7);
        MyThread1 myThread8 = new MyThread1(8);
        MyThread1 myThread9 = new MyThread1(9);
        MyThread1 myThread10 = new MyThread1(10);
        MyThread1 myThread11 = new MyThread1(11);
        MyThread1 myThread12 = new MyThread1(12);
        MyThread1 myThread13 = new MyThread1(13);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
        myThread8.start();
        myThread9.start();
        myThread10.start();
        myThread11.start();
        myThread12.start();
        myThread13.start();
    }
}
