import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;
    private ArrayList<Module>  modulesRegistered;
    private ArrayList<Course> coursesRegistered;

     Student(String name,int age,String DOB){
         this.name=name;
         this.age=age;
         this.DOB=DOB;
     }

     public String getUsername(){
         username=name+age;
         return username;
     }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<Module> getModulesRegistered() {
        return modulesRegistered;
    }

    public ArrayList<Course> getCoursesRegistered() {
        return coursesRegistered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setModulesRegistered(ArrayList<Module> modulesRegistered) {
        this.modulesRegistered = modulesRegistered;
    }

    public void setCoursesRegistered(ArrayList<Course> coursesRegistered) {
        this.coursesRegistered = coursesRegistered;
    }
}
