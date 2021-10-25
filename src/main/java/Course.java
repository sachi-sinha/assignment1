import org.joda.time.DateTime;

import java.util.List;

public class Course {
    private String name;
    private List<Module> moduleList;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, List<Module> moduleList, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.moduleList = moduleList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
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
