package TestDay01;

import org.junit.Test;

import java.util.*;

/**
 * Created by Mr.w on 2017/7/22.
 * 泛型
 */
public class TestGeneric {
    @Test
    public void test1(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }

        for(String s:list){
            System.out.println(s);
        }
    }
    @Test
    public void test2(){
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"aa");
        map.put(2,"bb");
        map.put(3,"cc");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
