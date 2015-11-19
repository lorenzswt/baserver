package mloBa.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mloBa.Enums.CivilStatus;
import mloBa.domain.person.Student;
import mloBa.repository.StudentRepository;

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/")
    @ResponseBody
    public String test() {
       Student student = new Student("First", "Test", CivilStatus.LEDIG);
       student.setFirstName("First");
       student.setLastName("Test");
       studentRepository.save(student);
        return "hello";
    }
}
