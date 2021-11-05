import org.joda.time.DateTime;

import java.util.List;
import java.util.UUID;

public class Student {
    private static final UUID id = UUID.randomUUID();

    private String name; // name of student
    private int age; // age of student
    private DateTime dateOfBirth; // date of birth of student
    private List<String> modulesRegistered; // modules a student's registered in
    private String course; // student's course

    public Student(String name, int age, DateTime dateOfBirth, List<String> modulesRegistered, String course){
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.modulesRegistered = modulesRegistered;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        // name shouldn't be an empty string
        if(name.equals("")){
            throw new Exception("Null values not accepted");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        // age of student can't be less than 0
        if(age <= 0){
            throw new Exception("Age can't be less than 0");
        }
        this.age = age;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getModulesRegistered() {
        return modulesRegistered;
    }

    public void setModulesRegistered(List<String> modulesRegistered) throws Exception {
        // student needs to register for some modules
        if (modulesRegistered.size() == 0){
            throw new Exception("No modules registered");
        }
        this.modulesRegistered = modulesRegistered;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) throws Exception {
        // course can't be an empty string
        if(course.equals("")){
            throw new Exception("Null values not accepted");
        }
        this.course = course;
    }

    public String getUserName(){
        return name + age;
    }

    public UUID getId(){
        return id;
    }
}
