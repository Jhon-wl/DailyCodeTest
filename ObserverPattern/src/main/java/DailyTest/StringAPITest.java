package DailyTest;

import org.junit.Test;

import java.io.IOException;
import java.util.Random;

/**
 * Create by mr.wl on 2017/8/13
 */
public class StringAPITest {
    @Test
    public void test1(){
        String str = "abcdedcba";
        System.out.println("长度"+str.length());
        System.out.println(str.charAt(4)+"  "+str.indexOf("a")+"  "+str.lastIndexOf("a"));
    }
    @Test
    public void test2(){
        String str = "itcast";
        System.out.println(str.replace("it","asd"));
        String str1 = " i t c a s t ";
        String []asd = str1.split(" ");//如果一个字符串以空格开始,使用split(" ");不会从第一个空格开始截取,从第二个空格截取
        for (String s :asd){
            System.out.println(s);
        }
        System.out.println(asd.length);
        System.out.println(str1.trim());
        System.out.println(str1.replace(" ",""));
        System.out.println(str.substring(0,2));
        System.out.println(str.charAt(0));//返回字符串上下标位x 的元素
    }
    @Test
    public void test3(){

        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb1 = new StringBuffer("abc");
        System.out.println(sb.equals(sb1));
        //StringBuffer sb2 = sb+sb1;  StringBuffer不能用字符串拼接,会编译报错
    }
    @Test
    public void test4(){
        Long start = System.currentTimeMillis();

        int sum=0;
        for (int i = 0 ; i < 100000000 ; i++){
            sum+=i;
        }
        Long end = System.currentTimeMillis();
        System.out.println((end-start));
    }

    @Test
    public void test5() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process process = rt.exec("notepad.exe");
        Thread.sleep(5000);
        process.destroy();

    }

    @Test
    public void test6(){
        //seed为种子,若不指定种子,每次中字都是随机的;若指定种子,不管多少次随机序列都是一定的.
        Random random = new Random(13);
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(random.nextInt(100));
        }

        int a = Integer.parseInt("11");
        System.out.println(a);
    }
}

