import org.joda.time.DateTime;

import java.util.List;

public class Course {
    private String name;
    private List<Module> modules;
    private List<Student> students;
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
        modules.add(module);
    }

    public void addStudents(Student student) {
        students.add(student);
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
