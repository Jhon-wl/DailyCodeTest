package TestDay01;

import java.util.Date;

/**
 * Created by Mr.w on 2017/7/21.
 * 当一类的字段有get或set方法时，则称其为属性
 * 本类中有五个属性，因为有四个不同的get方法，还有一个隐藏的继承自object类的getClass方法，所以共有五个属性
 */
public class BeanUtilsPerson {       //Javabean
    private String name;        //字段
    private String password;    //字段
    private int age;            //字段
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BeanUtilsPerson(){

    }
    public String getAB(){
        return "ab";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
