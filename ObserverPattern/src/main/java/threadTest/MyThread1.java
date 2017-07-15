package threadTest;

/**
 * Created by mr.w on 2017/6/21.
 */
public class MyThread1 extends Thread{
    private int i;
    public MyThread1(int i){
        super();
        this.i=i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
