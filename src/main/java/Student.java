import org.joda.time.DateTime;

import java.util.List;
import java.util.UUID;

public class Student {
    private static final UUID id = UUID.randomUUID();

    private String name;
    private int age;
    private DateTime dateOfBirth;

    public Student(String name, int age, DateTime dateOfBirth){
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getUserName(){
        return name + age;
    }

    public UUID getId(){
        return id;
    }
}
