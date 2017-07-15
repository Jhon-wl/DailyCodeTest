package Product_Customer;

/**
 * Created by Mr.w on 2017/6/23.
 */
public class Test {
    public static void main(String args[]){
        //创建仓库对象
        Storage storage = new Storage();
        //生产者对象
        Productor productor1 = new Productor(storage);
        Productor productor2 = new Productor(storage);
        Productor productor3 = new Productor(storage);
        Productor productor4 = new Productor(storage);
        Productor productor5 = new Productor(storage);
        Productor productor6 = new Productor(storage);
        Productor productor7 = new Productor(storage);

        //消费者对象
        Consumer consumer1 = new Consumer(storage);
        Consumer consumer2 = new Consumer(storage);
        Consumer consumer3 = new Consumer(storage);

        //设置生产数量
        productor1.setNum(10);
        productor2.setNum(10);
        productor3.setNum(10);
        productor4.setNum(10);
        productor5.setNum(10);
        productor6.setNum(10);
        productor7.setNum(80);

        //设置消费数量
        consumer1.setNum(50);
        consumer2.setNum(20);
        consumer3.setNum(30);

        //线程开始执行
        consumer1.start();
        consumer2.start();
        consumer3.start();
        productor1.start();
        productor2.start();
        productor3.start();
        productor4.start();
        productor5.start();
        productor6.start();
        productor7.start();
    }
}
