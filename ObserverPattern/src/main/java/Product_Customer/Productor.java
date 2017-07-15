package Product_Customer;

/**
 * Created by Mr.w on 2017/6/23.
 * 生产者类，继承thread类
 */
public class Productor extends Thread{
    //定义生产的个数num
    private int num;
    //定义所放置的仓库
    private Storage storage;
    //构造函数设置仓库
    public Productor(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run() {
        produce(num);
    }
    //调用仓库生产函数

    //get和set
    public void produce(int num){
        storage.produce(num);
    }

    public int getNum() {
        return num;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
