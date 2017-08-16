package CodeOnline5;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by mr.wl on 2017/8/15
 */
public class ZhengZe {
    @Test
    public void  test(){
        /*
        * 通过正则表达式对邮箱进行验证
        * */
        String str = "13152470525@163.com";
        String  regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
