package CodeOnline6;

import org.junit.Test;

import java.sql.*;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Create by mr.wl on 2017/8/17
 */
public class TestJDBC {

    @Test
    public void test() throws ClassNotFoundException, SQLException {
        /*
        * 贾连欲执事
        * 加载驱动
        * 连接数据库
        * 预处理sql
        * 执行sql
        * 释放资源,关闭连接
        * */
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/testsql";
        String name = "root";
        String password = "123456";

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,name,password);
        System.out.println("liaa");
        String sql = "select * from stu";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet set = statement.executeQuery();
//        ArrayList list = (ArrayList) set.getArray(1);
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        while (set.next()){
            int id = set.getInt("id");
            String string = set.getString(2);
            System.out.println(id+"---"+string);
        }
        conn.close();



    }
}
