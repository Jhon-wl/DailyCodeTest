package DailyTest;

/**
 * Created by Mr.w on 2017/6/29.
 * 求给定key值得阶乘
 */
public class lispTest {
    public static int doLisp(int i){
        if(i==1)
            return 1;
        return doLisp(i-1)*i;
    }
    public static void main(String args[]){
        int a=10;
        int b;
        b = doLisp(a);
        System.out.println(b);
    }
}
