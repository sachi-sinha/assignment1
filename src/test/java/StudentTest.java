import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StudentTest {
    private final List<String> courseList = List.of("ECE", "IT", "BIS", "BA", "CSE");
    private final List<String> moduleList = List.of("CT212", "MA1111", "EE2101", "MA2343");
    private final Student student = new Student("ABC", 22, DateTime.parse("2000-05-26"), courseList, moduleList);

    @Test
    public void testSetName(){
        student.setName("XYZ");
        assert(student.getName()).equals("XYZ");
    }

    @Test
    public void testSetAge(){
        student.setAge(19);
        assert(String.valueOf(student.getAge())).equals(String.valueOf(19));
    }

    @Test
    public void testDateofBirth(){
        student.setDateOfBirth(DateTime.parse("2000-01-01"));
        assert(student.getDateOfBirth()).equals(DateTime.parse("2000-01-01"));
    }

    @Test
    public void testSetCourseList(){
        student.setCourseList(List.of("ECE", "IT"));
        assert(student.getCourseList()).equals(List.of("ECE", "IT"));
    }

    @Test
    public void testSetModuleList(){
        student.setModuleList(List.of("CT2133", "MA2100", "EE4202"));
        assert(student.getModuleList()).equals(List.of("CT2133", "MA2100", "EE4202"));
    }

    @Test
    public void testGetStudentUserNamePass(){
        assert(student.getUserName()).equals("ABC" + 22);
    }

    @Test
    public void testGetStudentUserNameFail(){
        assertFalse(student.getUserName() == ("ABC" + 21));
    }
}