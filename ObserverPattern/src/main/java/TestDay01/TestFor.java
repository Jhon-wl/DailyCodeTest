package TestDay01;

import org.junit.Test;

import java.util.*;

/**
 * Created by Mr.w on 2017/7/18.
 * 增强for
 */
public class TestFor {
    /*
    * 遍历hashmap
    * */
    @Test
    public void TestMap(){
        //Map map = new HashMap();//遍历结果是倒着输出的
        Map map = new LinkedHashMap();
        map.put("1","aaa");
        map.put("2","bbb");
        map.put("3","ccc");

        //传统方式1
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            String s1 = (String) iterator.next();
            String s2 = (String)map.get(s1);
            System.out.println(s1+"="+s2);
        }
        //传统方式2
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()){
            Map.Entry entry = (Map.Entry) iterator1.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key+"="+value);
        }
        //增强for的第1种实现方式

        for(Object obj:map.keySet()){

            String key1 = (String)obj;
            String value1 = (String) map.get(key1);
            System.out.println(key1+"="+value1);
        }

        //增强for的第2种实现方式
        for(Object obj:map.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String key2 = (String) entry.getKey();
            String value2 = (String) entry.getValue();
            System.out.println(key2+"="+value2);
        }
    }
}
