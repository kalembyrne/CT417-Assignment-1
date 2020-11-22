import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;

public class CourseTest {
    private Student student = new Student("Jonny smith",18,"11/11/99");
    private Module module= new Module("software","CT417");

    DateTime startDate = new DateTime(2020,9,29,9,00);
    DateTime endDate = new DateTime(2021,5,29,9,00);
    private  Course course = new Course("ECE4",startDate,endDate);

    @Test
    public void addstudentTest(){
        course.addStudents(student);

        assertTrue(course.getStudents().contains(student));
    }

    @Test
    public void RemStudentTest(){
        course.addStudents(student);
        course.removeStudent(student);

        assertTrue(!course.getStudents().contains(student));
    }

    @Test
    public void addmoduleTest(){
        course.addModule(module);

        assertTrue(course.getModules().contains(module));
    }

    @Test
    public void RemModuleTest(){
        course.addModule(module);
        course.removeModule(module);

        assertTrue(!course.getModules().contains(module));
    }

}
