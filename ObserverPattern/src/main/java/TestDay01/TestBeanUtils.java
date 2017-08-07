package TestDay01;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mr.w on 2017/7/21.
 * 使用BeanUtils操作类的属性
 */
public class TestBeanUtils {
    @Test
    public void test() throws Exception {
        BeanUtilsPerson bp = new BeanUtilsPerson();
        BeanUtils.setProperty(bp,"name","qwer");
        System.out.println(bp.getName());
    }
    @Test
    /*
    * BeanUtils可以对数据进行转化   例如下面将String的age 转化为 BeanUtilsPerson中的int类型
    * 转换只支持八种基本类型   只能将一种类型转化为八种基本类型
    * */
    public void test1() throws Exception {
        String  name = "asd";
        String password = "123";
        String age = "58";
        BeanUtilsPerson bp = new BeanUtilsPerson();
        BeanUtils.setProperty(bp,"name",name);
        BeanUtils.setProperty(bp,"password",password);
        BeanUtils.setProperty(bp,"age",age);

        System.out.println(bp.getName());
        System.out.println(bp.getPassword());
        System.out.println(bp.getAge());

    }
    /*
    * 由于BeanUtils框架只支持基本数据类型的转化
    * */
    @Test
    public void test2() throws InvocationTargetException, IllegalAccessException {
        String birthday = "1995-08-16";
        BeanUtilsPerson bp = new BeanUtilsPerson();
        /*
        * 为了让日期赋值到bean的birthday属性上，我们给BeanUtils注册一个日期转化器
        * */
        ConvertUtils.register(new Converter() {

            public Object convert(Class aClass, Object o) {
                if(o==null){
                    return null;
                }
                if(!(o instanceof String)){
                    throw new ConversionException("只支持String类型的转换");
                }
                String value = (String) o;
                if(value.trim().equals("")){
                    return null;
                }
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    return df.parse(value);
                } catch (ParseException e) {
                    throw new RuntimeException(e);//异常链不能断，需要将异常传至框架上一层
                }
            }
        }, Date.class);


        BeanUtils.setProperty(bp,"birthday",birthday);
        System.out.println(bp.getBirthday().toLocaleString());

    }

    @Test
    public void test3() throws InvocationTargetException, IllegalAccessException {
        String birthday = "1995-08-16";
        BeanUtilsPerson bp = new BeanUtilsPerson();
        ConvertUtils.register( new DateLocaleConverter(),Date.class);
        BeanUtils.setProperty(bp,"birthday",birthday);
        System.out.println(bp.getBirthday().toLocaleString());
    }
    @Test
    public void test4() throws InvocationTargetException, IllegalAccessException {
        /*
        * 用Map填充时必须和bean的属性名相同
        * */
        Map map = new HashMap();
        map.put("name","qwer");
        map.put("password","123456");
        map.put("age","45");
        map.put("birthday","1995-08-16");
        BeanUtilsPerson bp = new BeanUtilsPerson();
        ConvertUtils.register(new DateLocaleConverter(),Date.class);
        BeanUtils.populate(bp,map);//用Map集合中的值，填充bean属性

        System.out.println(bp.getName());
        System.out.println(bp.getPassword());
        System.out.println(bp.getAge());
        System.out.println(bp.getBirthday());

    }
}
