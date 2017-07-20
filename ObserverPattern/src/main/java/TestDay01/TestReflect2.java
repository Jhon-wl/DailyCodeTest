package TestDay01;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.w on 2017/7/20.
 * 通过反射获取构造函数，创建对象
 */
public class TestReflect2 {
    @Test
    public void run() throws Exception {
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Constructor constructor = clazz.getConstructor(null);
        ReflectPerson person =(ReflectPerson) constructor.newInstance(null);
        System.out.println(person.a);
    }
    @Test
    public void run1() throws Exception {
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Constructor constructor = clazz.getConstructor(String.class,int.class);
        ReflectPerson person = (ReflectPerson) constructor.newInstance("qwer",22);
        System.out.println(person.a);
    }
    @Test
    public void run2() throws Exception {
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Constructor constructor = clazz.getDeclaredConstructor(List.class);
        constructor.setAccessible(true);//暴力反射
        ReflectPerson person = (ReflectPerson) constructor.newInstance(new ArrayList());
        System.out.println(person.a);
    }
    @Test
    //此方法只能调用无参构造函数创建对象
    public void run3() throws Exception {
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        ReflectPerson person = (ReflectPerson) clazz.newInstance();
        System.out.println(person.a);
    }
}
