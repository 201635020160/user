package service.impl;

import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.Student;
import service.StudentService;

import java.util.List;

@Service
//@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student findStudentById(Integer id) {
        return this.studentDao.findStudentById(id);
    }

    @Override
    public List<Student> findAllStudent() {
        return this.studentDao.findAllStudent();
    }

    @Override
    public int addNewStudent(Student student) {
        return this.studentDao.addNewStudent(student);
    }

    @Override
    public int editStudent(Student student) {
        return this.studentDao.editStudent(student);
    }

    @Override
    public int deleteStudent(Integer stuId) {
        return this.studentDao.deleteStudent(stuId);
    }
}
