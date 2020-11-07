import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StudentTest {

    @Test
    void usernameTest(){
        Student student = new Student("Name",18,"11/11/99");
        assertEquals(student.getUsername(),student.getName()+student.getAge());
    }
}
