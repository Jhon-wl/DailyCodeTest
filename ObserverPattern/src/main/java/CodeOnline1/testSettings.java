package CodeOnline1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Create by mr.wl on 2017/8/6
 */
public class testSettings {
    @Test
    public  void  test1() throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("sources/test.properties"));
        System.out.println(pro.getProperty("url"));
    }
}
