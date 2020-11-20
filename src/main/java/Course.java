import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Module> modules =new ArrayList<>();
    private List<Student> students=new ArrayList<>();
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name,DateTime startDate, DateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Student> getStudents() {
        return students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }


    public void addModule(Module module) {
        if(!modules.contains(module)){
            modules.add(module);
            module.addCourse(this);
        }
        else{
            System.out.println("Module already registered for course");
        }
    }

    public void removeModule(Module module) {
        if(modules.contains(module)){
            modules.remove(module);
        }
        else{
            System.out.println("Module not registered for course");
        }
    }

    public void addStudents(Student student) {
        if(!students.contains(student)){
            students.add(student);
            student.addCourse(this);
        }
        else{
            System.out.println("Student already registered");
        }

    }

    public void removeStudent(Student student) {
        if(students.contains(student)){
            students.remove(student);
        }
        else{
            System.out.println("Student not registered for course");
        }
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void setName(String name) {
        this.name = name;
    }
}
