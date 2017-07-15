package Product_Customer;

/**
 * Created by Mr.w on 2017/6/23.
 */
public class Consumer1 extends Thread{
    // 每次消费的产品数量
    private int num;

    // 所在放置的仓库
    private Storage1 storage;

    // 构造函数，设置仓库
    public Consumer1(Storage1 storage)
    {
        this.storage = storage;
    }

    // 线程run函数
    public void run()
    {
        consume(num);
    }

    // 调用仓库Storage的生产函数
    public void consume(int num)
    {
        storage.consume(num);
    }

    // get/set方法
    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public Storage1 getStorage() {
        return storage;
    }

    public void setStorage(Storage1 storage) {
        this.storage = storage;
    }
}
