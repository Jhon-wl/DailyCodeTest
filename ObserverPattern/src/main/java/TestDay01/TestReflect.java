package TestDay01;

/**
 * Created by Mr.w on 2017/7/20.
 *反射技术
 */
public class TestReflect{

    public TestReflect() throws ClassNotFoundException {

    }
    //第1种获取Class对象的方法
    Class clazz = Class.forName("TestDay01.ReflectPerson");
    //第2种获取Class对象的方法
    Class clazz1 = new ReflectPerson().getClass();
    //第3种获取Class对象的方法
    Class clazz2 = ReflectPerson.class;
}
