package Extends;

/**
 * Created by mr.w on 2017/6/21.\
 * 抽象类不能实例化
 * abstract描述的方法不能实现
 * 当一个类里有抽象方法是则该类为抽象类
 */
public abstract class abstractTest{
    public abstract void dofun();
    public void dofun(int a){
        System.out.println("haha");
    }
}
