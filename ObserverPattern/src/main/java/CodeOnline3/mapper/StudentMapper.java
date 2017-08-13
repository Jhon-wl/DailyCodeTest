package CodeOnline3.mapper;

import CodeOnline3.entity.Student;

import java.util.List;

/**
 * Create by mr.wl on 2017/8/10
 */
public interface StudentMapper {
    //插入学生信息到数据库
    int insertStudent(Student student) throws Exception;

    //查询学生信息
    Student selectStudent(int id)throws Exception;

    //查询所有学生的信息
    List<Student> selectALLStudent()throws Exception;
}
