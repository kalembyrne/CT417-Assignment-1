import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
    private Student student = new Student("Jonny smith",18,"11/11/99");
    private Module module= new Module("software","CT417");

    DateTime startDate = new DateTime(2020,9,29,9,00);
    DateTime endDate = new DateTime(2021,5,29,9,00);
    private  Course course = new Course("ECE4",startDate,endDate);

    @Test
    void addstudentTest(){
        course.addStudents(student);

        assertTrue(course.getStudents().contains(student));
    }

    @Test
    void RemStudentTest(){
        course.removeStudent(student);

        assertTrue(!course.getStudents().contains(student));
    }

    @Test
    void addmoduleTest(){
        course.addModule(module);

        assertTrue(course.getModules().contains(module));
    }

    @Test
    void RemModuleTest(){
        course.removeModule(module);

        assertTrue(!course.getModules().contains(module));
    }

}
