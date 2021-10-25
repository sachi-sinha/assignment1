import java.util.List;

public class Module {
    private String name;
    private String id;
    private List<Student> studentList;

    public Module(String name, String id, List<Student> studentList) {
        this.name = name;
        this.id = id;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
