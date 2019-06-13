package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import po.Student;
import service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/findStudentById")
    public String findStudentById(Integer id, Model model) {
        Student student = studentService.findStudentById(id);
        model.addAttribute("student", student);
        return "student";
    }

    @RequestMapping("/findAllStudent")
    public String findAllStudent(HttpServletRequest request) {
        List studentList = studentService.findAllStudent();
        request.setAttribute("studentList", studentList);
        return "student";
    }

    @RequestMapping("/add")
    public String add() {
        return "addStudent";
    }

    @RequestMapping("/addNewStudent")
    public String addNewStudent(Student student) {
        int isAdded = studentService.addNewStudent(student);
        if (isAdded > 0) {
            return "redirect:findAllStudent";
        }
        return "error";
    }

    @RequestMapping("/edit")
    public String edit(HttpServletRequest request) {
        request.setAttribute("id", request.getParameter("id"));
        request.setAttribute("name", request.getParameter("name"));
        request.setAttribute("sex", request.getParameter("sex"));
        request.setAttribute("age", request.getParameter("age"));
        return "editStudent";
    }

    @RequestMapping("/editStudent")
    public String editStudent(Student student) {
        int isUpdate = studentService.editStudent(student);
        if (isUpdate > 0) {
            return "redirect:findAllStudent";
        }
        return "error";
    }

    @RequestMapping("deleteStudent")
    public String deleteStudent(Integer stuId) {
        int isDeleted = studentService.deleteStudent(stuId);
        if (isDeleted > 0) {
            return "redirect:findAllStudent";
        }
        return "error";
    }
}
