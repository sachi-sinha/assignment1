import org.joda.time.DateTime;

import java.util.List;

public class Course {
    private String name; // name of the course
    private List<Module> moduleList; // modules in the course
    private DateTime startDate; // course start date
    private DateTime endDate; // course end date

    public Course(String name, List<Module> moduleList, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.moduleList = moduleList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        // name can't be an empty string
        if(name.equals("")){
            throw new Exception("Null values not accepted");
        }
        this.name = name;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) throws Exception {
        // module list can't be empty for a course
        if (moduleList.size() == 0){
            throw new Exception("Module list can't be 0");
        }
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
