import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModuleTest {
    private Student student = new Student("Jonny smith",18,"11/11/99");
    private Module module= new Module("software","CT417");

    DateTime startDate = new DateTime(2020,9,29,9,00);
    DateTime endDate = new DateTime(2021,5,29,9,00);
    private  Course course = new Course("ECE4",startDate,endDate);

    @Test
    public void addstudentTest(){
        module.registerStudent(student);

        assertTrue(module.getRegisteredStudents().contains(student));
    }

    @Test
    public void RemStudentTest(){
        module.registerStudent(student);
        module.removeStudent(student);

        assertTrue(!module.getRegisteredStudents().contains(student));
    }

    @Test
    public void addCourseTest(){
        module.addCourse(course);
        assertTrue(module.getCourses().contains(course));
    }

    @Test
    public void remCourseTest(){
        module.addCourse(course);
        module.removeCourse(course);
        assertTrue(!module.getCourses().contains(course));
    }

}
