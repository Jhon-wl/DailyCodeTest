package CodeOnline3;

import CodeOnline3.entity.Student;
import CodeOnline3.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * Create by mr.wl on 2017/8/10
 */
public class Main {
    @Test
    public void test1() throws Exception {
        InputStream inputStream = Main.class.getResourceAsStream("application-context.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setAge(22);
        student.setId(12);
        student.setName("laoguo");
        student.setSex("男");
        student.setTeacherId(11);
        studentMapper.insertStudent(student);

        sqlSession.commit();
        sqlSession.close();
    }
}
