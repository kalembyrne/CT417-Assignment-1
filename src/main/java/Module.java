import java.util.ArrayList;
import java.util.List;

public class Module {
    private String name;
    private String ID;
    private List<Student> registeredStudents;
    private List<Course> courses;

    public Module(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public List<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void RegisterStudent(Student student) {
        registeredStudents.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
