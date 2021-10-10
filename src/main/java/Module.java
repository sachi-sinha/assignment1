import java.util.List;

public class Module {
    private String name;
    private String id;
    private List<String> studentList;
    private List<String> courseList;

    public Module(String name, String id, List<String> studentList, List<String> courseList) {
        this.name = name;
        this.id = id;
        this.studentList = studentList;
        this.courseList = courseList;
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

    public List<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<String> studentList) {
        this.studentList = studentList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public List<String> getCourseList() {
        return courseList;
    }
}
