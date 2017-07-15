package Extends;

/**
 * Created by mr.w on 2017/6/21.
 */
public class child extends parents {
    @Override
    protected void dofun() {
        super.dofun();
    }

    //重写父类的方法，方法名、参数列表、返回值都与父类一样，访问修饰符可以不一样，但是要比父类的范围大
    @Override
    public void dotest() {
        int a=1;
    }
}
