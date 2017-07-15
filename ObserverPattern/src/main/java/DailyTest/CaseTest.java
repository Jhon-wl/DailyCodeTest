package DailyTest;
import java.util.*;
/**
 * Created by Mr.w on 2017/6/23.
 * case穿透，在使用switch和case时，如果不加break，就会找到跟它匹配的情况，按顺序继续执行，或者执行至选择结束
 * 如果碰到break，就退出选择
 */
public class CaseTest {
    public static void main(String args[]){
        char c = 'A';
        int num = 10;
        switch (c){
            case'B':
                num++;
                System.out.println("b:"+num);
            case'A':
                num++;
                System.out.println("a:"+num);
            case'Y':
                num++;
                System.out.println("y:"+num);
                break;
            default:
                num--;
                System.out.println("def:"+num);
        }
        System.out.println(num);
        ArrayList list = new ArrayList(-1);
    }
}
