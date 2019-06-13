package dao;

import po.Student;

import java.util.List;

public interface StudentDao {
    public Student findStudentById(Integer id);

    public List<Student> findAllStudent();

    public int addNewStudent(Student student);

    public int editStudent(Student student);

    public int deleteStudent(Integer stuId);
}
