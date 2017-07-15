package Extends;

/**
 * Created by mr.w on 2017/6/21.
 * 接口用interface描述，不能实例化
 * 接口里的方法全为抽象方法，访问权限为public
 * 一个类实现接口必须重写接口里的所有方法，如果不实现就必须将自己声明为抽象类
 */
public interface interfaceTest {
    static final int a=0;
    public void funny();
    public void dofun();
    public void dotest();
}
