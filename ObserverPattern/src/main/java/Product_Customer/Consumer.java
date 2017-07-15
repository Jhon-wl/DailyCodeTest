package Product_Customer;

/**
 * Created by Mr.w on 2017/6/23.
 * 消费者类，继承thread类
 */
public class Consumer extends Thread{
    //每次要消费的产品num
    private int num;
    //产品存放的仓库
    private Storage storage;
    //构造函数设置仓库
    public Consumer(Storage  storage){
        this.storage = storage;
    }
    //线程run方法
    @Override
    public void run() {
        consume(num);
    }
    //调用仓库的消费函数
    public void consume(int num){
        storage.consume(num);
    }
    //get和set

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
