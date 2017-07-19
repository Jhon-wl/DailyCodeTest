package TestDay01;

import org.junit.Test;

/**
 * Created by Mr.w on 2017/7/19.
 * 枚举
 */
public class TestEnum2 {

    @Test
    public void test(){
        print(Grade2.A);
    }
    public void print(Grade2 grade){  //只能输出 A B C D E
           String value = grade.printValue();
        System.out.println(value);
    }

}
enum Grade2{     //class  带有抽象方法的枚举
    A("100-90"){
       public String printValue(){
           return "优秀";
       }
    }
    ,B("89-80"){
        public String printValue(){
            return "良好";
        }
    }
    ,C("79-70"){
        public String printValue(){
            return "一般";
        }
    }
    ,D("69-60"){
        public String printValue(){
            return "合格";
        }
    }
    ,E("59-0"){
        public String printValue(){
            return "不及格";
        }
    }
    ;  //object

    private String value;
    private Grade2(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
    public abstract String printValue();
}