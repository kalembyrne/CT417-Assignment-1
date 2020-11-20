import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ModuleTest {
    private Student student = new Student("Jonny smith",18,"11/11/99");
    private Module module= new Module("software","CT417");

    DateTime startDate = new DateTime(2020,9,29,9,00);
    DateTime endDate = new DateTime(2021,5,29,9,00);
    private  Course course = new Course("ECE4",startDate,endDate);

    @Test
    void addstudentTest(){
        module.registerStudent(student);

        assertTrue(module.getRegisteredStudents().contains(student));
    }

    @Test
    void RemStudentTest(){
        module.removeStudent(student);

        assertTrue(!module.getRegisteredStudents().contains(student));
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
