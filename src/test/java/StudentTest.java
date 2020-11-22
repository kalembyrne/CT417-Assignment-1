import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;


public class StudentTest {


    private Student student = new Student("Jonny smith",18,"11/11/99");
    private Module module1= new Module("software","CT417");

    DateTime startDate = new DateTime(2020,9,29,9,00);
    DateTime endDate = new DateTime(2021,5,29,9,00);
    private  Course course = new Course("ECE4",startDate,endDate);


    @Test
    public void usernameTest(){
        assertEquals(student.getUsername(),(student.getName()+student.getAge()).replaceAll(" ",""));
    }

    @Test
    public void addmoduleTest(){
        student.addModule(module1);
        List<Module> modulesTestcase = student.getModulesRegistered();

        assertTrue(modulesTestcase.contains(module1));
    }

    @Test
    public void RemModuleTest(){
        student.addModule(module1);
        student.removeModule(module1);
        assertTrue(!student.getModulesRegistered().contains(module1));
    }

    @Test
    public void addCourseTest(){
        student.addCourse(course);
        assertTrue(student.getCoursesRegistered().contains(course));
    }

    @Test
    public void remCourseTest(){
        student.addCourse(course);
        student.removeCourse(course);
        assertTrue(!student.getCoursesRegistered().contains(course));
    }

}
