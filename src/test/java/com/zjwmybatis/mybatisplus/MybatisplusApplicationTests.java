package com.zjwmybatis.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjwmybatis.mybatisplus.mysql.entity.Student;
import com.zjwmybatis.mybatisplus.mysql.entity.Teacher;
import com.zjwmybatis.mybatisplus.mysql.mapper.db1.StudentMapper;
import com.zjwmybatis.mybatisplus.mysql.mapper.db2.TeacherMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * mybatisplusѧϰƪ
 */
@SpringBootTest
class MybatisplusApplicationTests {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;

    @Test
    void contextLoads() {
        List<Student> students = studentMapper.selectList(null);
        students.forEach(System.out::println);
        List<Teacher> teachers = teacherMapper.selectList(null);
        teachers.forEach(System.out::println);

    }


    @Test
    void test3() {
        // ��ѯ��Ϣ
        Student student = studentMapper.selectById(1L);
        student.setName("1312");
        student.setAge(30);

        // ����
        int insert = studentMapper.updateById(student);
        System.out.println(insert);
        System.out.println(student);
    }
    @Test
    void test4() {
        // ��һ���̲߳�ѯ��Ϣ
        Student student = studentMapper.selectById(1L);
        student.setName("abc");
        student.setAge(31);
        // ģ��ڶ����̲߳�Ӳ���
        Student student1 = studentMapper.selectById(1L);
        student1.setName("eds");
        student1.setAge(32);
        // ����
        studentMapper.updateById(student1);

        // ����ͨ������������γ����ύ
        studentMapper.updateById(student);// ���û���ֹ������ͻḲ�ǲ���̵߳�ֵ
    }
    //��ҳ��ѯ
    @Test
    void test7(){
        Page<Teacher> page = new Page<>(1,2);

        teacherMapper.selectPage(page, null);
        //��ѯ��¼������ӡ
        page.getRecords().forEach(System.out::println);
        //����
        System.out.println(page.getTotal());
    }



    //����ɾ��
    @Test
    void test8(){
        //����idɾ��
        studentMapper.deleteById(1L);

//        Student student = studentMapper.selectById(1L);
        //����ɾ��
//        studentMapper.deleteBatchIds(Arrays.asList(1,2));


    }

}
