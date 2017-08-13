package DailyTest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Create by mr.wl on 2017/8/13
 */
public class TestHashMap {
    @Test
    public void test(){
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"aa");
        map.put(2,"bb");
        map.put(3,"cc");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = (Map.Entry<Integer, String>) iterator.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"=="+value);
        }

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"=="+value);
        }
    }
}
