package DailyTest.Overload;

/**
 * Create by mr.wl on 2017/8/15
 */
public class testOverload {
    /*方法的重写
    * 1.参数个数不同,可以重载
    * 2.个数相同,类型不同,可以重载
    * 3.参数个数相同,参数类型不同(此处的参数类型相同指两个重载方法中的参数类型相同,
    *           但是单个方法中的参数类型不同),参数顺序不同也可以重载
    * 以上三种情况存在的时候,也可以改变返回值类型,但是单独的改变返回值类型,不能重载
    * */

    public void test(){}

    public String test(String a){
        return "S";
    }

    public void test(String a,String b){}

    public void test(String b,int a){}

    public void test(int a,String b){}
}
