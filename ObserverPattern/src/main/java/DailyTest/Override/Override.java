package DailyTest.Override;

/**
 * Create by mr.wl on 2017/8/15
 */
public class Override extends TestOverride{

    /*
    * 重写:重写时必须与父类的方法名，参数列表，返回值类型相同，访问修饰符要大于或者等于父类的修饰符权限
    * */


    @java.lang.Override
    public void TestExtends(String a) {

    }


    String dofun() {
        return null;
    }
}
