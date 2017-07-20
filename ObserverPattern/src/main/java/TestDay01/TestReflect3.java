package TestDay01;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

/**
 * Created by Mr.w on 2017/7/20.
 * 通过反射获取方法
 */
public class TestReflect3 {
    @Test
    public void test1() throws Exception {
        ReflectPerson person = new ReflectPerson();
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Method method = clazz.getMethod("fun",null);
        method.invoke(person,null);
    }
    @Test
    public void test2() throws Exception {
        ReflectPerson person = new ReflectPerson();
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Method method = clazz.getMethod("fun",String.class,int.class);
        method.invoke(person,"laozhang",22);
    }
    @Test
    public void test3() throws Exception {
        ReflectPerson person = new ReflectPerson();
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Method method = clazz.getMethod("fun",String.class,int[].class);
        Class[] classes = (Class[]) method.invoke(person,"wang",new int[]{1,2,3});
        System.out.println(classes);
    }
    @Test
    //私有的方法需要暴力反射
    public void test4() throws Exception {
        ReflectPerson person = new ReflectPerson();
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Method method = clazz.getDeclaredMethod("fun", InputStream.class);
        method.setAccessible(true);//暴力反射
        method.invoke(person,new FileInputStream("F:\\kinggsoft\\a.txt"));
    }
    @Test
    //静态的方法不需要创建对象
    public void test5() throws Exception {
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Method method = clazz.getMethod("fun",int.class);
        method.invoke(null,78);

    }
    @Test
    //通过反射调用main方法
    public void test6() throws Exception {
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Method method = clazz.getMethod("main",String[].class);
        /*
        此处由于面方法的入口需要一个String数组，但是下面的方法传进去的是两个String数组，则需要用object类进行包装
        method.invoke(null,new String[]{"aaa","bbb"});
        */
        //第一种包装
        method.invoke(null,new Object []{new String[]{"aaa","bbb"}});
        //第二种包装
        method.invoke(null,(Object)new String[]{"aaa","bb"});
    }
}
