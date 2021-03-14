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
 * mybatisplus学习篇
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
        // 查询信息
        Student student = studentMapper.selectById(1L);
        student.setName("1312");
        student.setAge(30);

        // 更新
        int insert = studentMapper.updateById(student);
        System.out.println(insert);
        System.out.println(student);
    }
    @Test
    void test4() {
        // 第一个线程查询信息
        Student student = studentMapper.selectById(1L);
        student.setName("abc");
        student.setAge(31);
        // 模拟第二个线程插队操作
        Student student1 = studentMapper.selectById(1L);
        student1.setName("eds");
        student1.setAge(32);
        // 更新
        studentMapper.updateById(student1);

        // 可以通过自旋锁来多次尝试提交
        studentMapper.updateById(student);// 如果没有乐观锁，就会覆盖插队线程的值
    }
    //分页查询
    @Test
    void test7(){
        Page<Teacher> page = new Page<>(1,2);

        teacherMapper.selectPage(page, null);
        //查询记录遍历打印
        page.getRecords().forEach(System.out::println);
        //总数
        System.out.println(page.getTotal());
    }



    //测试删除
    @Test
    void test8(){
        //根据id删除
        studentMapper.deleteById(1L);

//        Student student = studentMapper.selectById(1L);
        //批量删除
//        studentMapper.deleteBatchIds(Arrays.asList(1,2));


    }

}
