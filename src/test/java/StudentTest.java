import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class StudentTest {


    private Student student = new Student("Jonny smith",18,"11/11/99");
    private Module module1= new Module("software","CT417");
    private Module module2= new Module("Machine Learning","CT4101");

    DateTime startDate = new DateTime(2020,9,29,9,00);
    DateTime endDate = new DateTime(2021,5,29,9,00);
    private  Course course = new Course("ECE4",startDate,endDate);


    @Test
    void usernameTest(){
        assertEquals(student.getUsername(),(student.getName()+student.getAge()).replaceAll(" ",""));
    }

    @Test
    void addmoduleTest(){
        student.addModule(module1);
        student.addModule(module2);
        List<Module> modulesTestcase = student.getModulesRegistered();

        assertTrue(modulesTestcase.contains(module1)&&modulesTestcase.contains(module2));
    }

    @Test
    void RemModuleTest(){
        student.removeModule(module1);
        assertTrue(!student.getModulesRegistered().contains(module1));
    }

    @Test
    void addCourseTest(){
        student.addCourse(course);
        assertTrue(student.getCoursesRegistered().contains(course));
    }

    @Test
    void remCourseTest(){
        student.removeCourse(course);
        assertTrue(!student.getCoursesRegistered().contains(course));
    }

}
