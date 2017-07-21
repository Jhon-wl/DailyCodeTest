package TestDay01;

import org.junit.Test;

import java.beans.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Mr.w on 2017/7/21.
 * 使用内省操作Javabean的属性
 */
public class TestIntrospector {
    @Test
    //使用内省获取Javabean的属性
    public void test() throws Exception {

        BeanInfo info = Introspector.getBeanInfo(IntrospectorPerson.class);
        //强行砍掉Object类的属性，只留下Javabean自己的属性
        //BeanInfo info1 = Introspector.getBeanInfo(IntrospectorPerson.class,Object.class);
        PropertyDescriptor[] bd = info.getPropertyDescriptors();
        for(PropertyDescriptor pd:bd){

            System.out.println(pd.getName());
        }


    }
    @Test
    public void test1() throws Exception {
        Class clazz = Class.forName("TestDay01.IntrospectorPerson");
        Constructor constructor = clazz.getConstructor(null);
        IntrospectorPerson ip= (IntrospectorPerson) constructor.newInstance(null);

        PropertyDescriptor pd = new PropertyDescriptor("age",IntrospectorPerson.class);
        //pd.getPropertyType()获取属性的类型
        System.out.println(pd.getPropertyType());
        //获取属性的set方法
        Method md = pd.getWriteMethod();
        md.invoke(ip,56);
        //获取属性的get方法
        Method md1 = pd.getReadMethod();
        System.out.println(md1.invoke(ip,null));

        PropertyDescriptor pd1 = new PropertyDescriptor("name",IntrospectorPerson.class);
        System.out.println(pd1.getPropertyType());
        Method m = pd1.getWriteMethod();
        m.invoke(ip,"qwer");
        Method m1 = pd1.getReadMethod();
        System.out.println(m1.invoke(ip,null));
    }

}
