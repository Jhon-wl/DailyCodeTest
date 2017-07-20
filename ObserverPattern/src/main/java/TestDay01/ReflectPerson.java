package TestDay01;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Mr.w on 2017/7/20.
 */
public class ReflectPerson {
    public String a = "aaaa";
    private int password;
    private static int age=23;

    public ReflectPerson(){
        System.out.println("person-null");
    }
    public ReflectPerson(String name){
        System.out.println("person-name");
    }
    public ReflectPerson(String name,int password){
        System.out.println("person-name-password");
    }
    private ReflectPerson(List list){
        System.out.println("person-list");
    }

    public void fun(){
        System.out.println("fun-null");
    }
    public void fun(String name,int password){
        System.out.println(name+":"+password);
    }
    public Class[] fun(String name,int []a){
        return new Class[]{String.class};
    }
    private void fun(InputStream in){
        System.out.println("inputStream");
    }
    public static void fun(int num){
        System.out.println(num);
    }

    public static void main(String args[]){
        System.out.println("main");
    }
}
