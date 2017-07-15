package Product_Customer;

import java.util.LinkedList;

/**
 * 实现仓库缓冲区
 * Created by Mr.w on 2017/6/23.
 */
public class Storage {
    //仓库的最大容量
    private  final int MAX_SIZE=100;
    //仓库存储的载体
    private LinkedList<Object> list = new LinkedList<Object>();
    //生产num个产品
    public void produce(int num){
        synchronized(list)
        {
            //如果库存量不足
            while(list.size() + num > MAX_SIZE){
                System.out.println("【要生产的数量】："+num+"\t【库存量】："+list.size()+"\t暂时不能执行生产任务！");
                try{
                    //由于条件不满足，生产阻塞
                    list.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            //生产条件满足，生产num个产品
            for(int i=1;i <= num;++i){
                list.add(new Object());

            }
            System.out.println("【已经生产的数量】："+num+"\t【现在库存量】："+list.size()+"生产成功");
            list.notifyAll();
        }
    }

    //消费产品num个产品
    public void consume(int num){
        //同步代码段
        synchronized(list)
        {
            //如果仓库储量不足
            while(list.size() < num){

                System.out.println("【要消费的数量】："+num+"\t【库存量】："+list.size()+"\t暂时不能执行消费任务！");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //如果仓库储量足够，消费num个产品
            for(int i=1;i <= num;++i){
                list.remove();
            }
            System.out.println("【已经消费的数量】："+num+"\t【现在库存量】："+list.size()+"消费成功");
            list.notifyAll();
        }
    }

    public LinkedList<Object> getList() {
        return list;
    }

    public void setList(LinkedList<Object> list) {
        this.list = list;
    }

    public  int getMaxSize() {
        return MAX_SIZE;
    }
}
