import java.util.List;

public class Module {
    private String name; // name of module
    private String id; // id of module
    private List<Student> studentList; // students registered in the module

    public Module(String name, String id, List<Student> studentList) {
        this.name = name;
        this.id = id;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        // module name can't be an empty string
        if(name.equals("")){
            throw new Exception("Null values not accepted");
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        // module id can't be an empty string
        if (id.equals("")){
            throw new Exception("Id can't be null");
        }
        this.id = id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
