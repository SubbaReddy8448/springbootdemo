package RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/display")
    public String display() {
        return "<b>Display method in SpringBoot RestController</b>";
    }

   
    List<Student> students = new ArrayList<>();

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student data inserted successfully";
    }

    @GetMapping("/viewStudents")
    public List<Student> viewStudents() {
        return students;
    }
}
