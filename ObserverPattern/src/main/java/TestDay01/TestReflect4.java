package TestDay01;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by Mr.w on 2017/7/20.
 * 通过反射调用类的字段
 */

public class TestReflect4 {
    @Test
    public void test() throws Exception {
        ReflectPerson p = new ReflectPerson();
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Field field= clazz.getField("a");
        Object obj = field.get(p);
        Class type =field.getType();
        if(type.equals(String.class)){
            String value = (String) obj;
            System.out.println(value);

        }

        field.set(p,"aaaaa");
        System.out.println(p.a);

    }
    @Test
    public void test2() throws Exception {
        ReflectPerson person = new ReflectPerson();
        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Field field = clazz.getDeclaredField("password");
        field.setAccessible(true);
        field.set(person,123);
        Object obj = field.get(person);
        Class type = field.getType();
        if(type.equals(int.class)){
            Integer pw = (Integer) obj;
            int password = pw;
            System.out.println(password);
        }
    }
    @Test
    public void test3() throws Exception {

        Class clazz = Class.forName("TestDay01.ReflectPerson");
        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println(field.get(null));
    }
}
