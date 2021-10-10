import org.joda.time.DateTime;

import java.util.List;
import java.util.UUID;

public class Student {
    private static final UUID id = UUID.randomUUID();

    private String name;
    private int age;
    private DateTime dateOfBirth;
    private List<String> courseList;
    private List<String> moduleList;

    public Student(String name, int age, DateTime dateOfBirth,
                   List<String> courseList, List<String> moduleList){
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.courseList = courseList;
        this.moduleList = moduleList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public void setModuleList(List<String> moduleList) {
        this.moduleList = moduleList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public List<String> getModuleList() {
        return moduleList;
    }

    public String getUserName(){
        return name + age;
    }

    public UUID getId(){
        return id;
    }
}
