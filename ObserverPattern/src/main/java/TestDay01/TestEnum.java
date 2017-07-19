package TestDay01;

import org.junit.Test;

/**
 * Created by Mr.w on 2017/7/19.
 * 枚举
 */
public class TestEnum {

    @Test
    public void test(){
        print(Grade.A);
    }
    public void print(Grade grade){  //只能输出 A B C D E
           String value = grade.getValue();
        System.out.println(value);
    }

}
/*
这是jdk1.5之前实现枚举功能的方法
class Grade{
    private Grade(){}
    public static final Grade A = new Grade();
    public static final Grade B = new Grade();
    public static final Grade C = new Grade();
    public static final Grade D = new Grade();
    public static final Grade E = new Grade();
}*/
/*
* 如何定义枚举的构造函数，方法和字段，去封装更多的信息
* */
enum Grade{     //class
    A("100-90"),B("89-80"),C("79-70"),D("69-60"),E("59-0");  //object

    private String value;
    private Grade(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }

}