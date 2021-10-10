import org.joda.time.DateTime;

import java.util.List;

public class Course {
    private String name;
    private List<String> moduleList;
    private List<String> studentList;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, List<String> moduleList, List<String> studentList, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.moduleList = moduleList;
        this.studentList = studentList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<String> moduleList) {
        this.moduleList = moduleList;
    }

    public List<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<String> studentList) {
        this.studentList = studentList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
