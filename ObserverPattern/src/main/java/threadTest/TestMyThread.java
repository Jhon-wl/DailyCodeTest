package threadTest;

/**
 * Created by mr.w on 2017/6/21.
 */
public class TestMyThread {
    public static void main(String []args){
        try{
            MyThread myThread = new MyThread();
            myThread.setName("mythread");
            myThread.start();
            for(int i=0;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
