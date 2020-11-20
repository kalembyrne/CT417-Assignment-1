import java.util.ArrayList;
import java.util.List;

public class Module {
    private String name;
    private String ID;
    private List<Student> registeredStudents=new ArrayList<>();
    private List<Course> courses=new ArrayList<>();

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

    public void setName(String name) { this.name = name; }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void addCourse(Course course) {
        if(!courses.contains(course)){
            courses.add(course);
        }
        else{
            System.out.println("course already registered for");
        }
    }
    public void removeCourse(Course course) {
        if(courses.contains(course)){
            courses.remove(course);
        }
        else{
            System.out.println("course not registered for");
        }
    }
    public void registerStudent(Student student) {
        if(!registeredStudents.contains(student)){
            registeredStudents.add(student);
            student.addModule(this);
        }
        else{
            System.out.println("Student already registered");
        }

    }

    public void removeStudent(Student student) {
        if(registeredStudents.contains(student)){
            registeredStudents.remove(student);
        }
        else{
            System.out.println("Student not registered for module");
        }
    }


}
