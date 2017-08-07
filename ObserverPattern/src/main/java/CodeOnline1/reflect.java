package CodeOnline1;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create by mr.wl on 2017/8/7
 */
public class reflect {
    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("CodeOnline1.person");
        person p = (person) clazz.newInstance();

        Constructor constructor = clazz.getDeclaredConstructor();

        Method method = clazz.getDeclaredMethod("add",int.class,int.class);
        Object x = method.invoke(p,2,4);
        System.out.println(x);


        CodeOnline1.Test test = method.getAnnotation(CodeOnline1.Test.class);
        System.out.println(test.desc());
        System.out.println(test.value());
    }

}
