import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertThrows;

class CourseTest {
    private final Student student1 = new Student("A", 21, DateTime.parse("2000-01-01"), List.of("EE2002", "CT2133", "EE2110"), "ECE");
    private final Student student2 = new Student("B", 22, DateTime.parse("2000-02-02"), List.of("MA111", "CT2002", "MM2133"), "EE");
    private final Student student3 = new Student("C", 23, DateTime.parse("2000-03-03"), List.of("CT3233", "EE1234", "EE2110"), "CS");
    private final Student student4 = new Student("D", 24, DateTime.parse("2000-04-04"), List.of("EE2002", "CT5555", "CT24244"), "ECE");
    private final Student student5 = new Student("E", 25, DateTime.parse("2000-05-05"), List.of("CT20012", "CT5787", "MA2131"), "EE");
    private final List<Student> studentList1 = List.of(student1, student2, student3);
    private final List<Student> studentList2 = List.of(student1, student3, student5);
    private final List<Student> studentList3 = List.of(student2, student4);
    private final Module module1 = new Module("Mathematical Methods", "CT2100", studentList1);
    private final Module module2 = new Module("Engineering Chemistry", "EE1111", studentList2);
    private final Module module3 = new Module("Engineering Computing", "CT3445", studentList3);
    private final List<Module> moduleList = List.of(module1, module2, module3);
    private final Course course = new Course("ECE", moduleList, DateTime.parse("2021-09-05"), DateTime.parse("2021-12-18"));

    @Test
    void testSetName(){
        try {
            course.setName("IT");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert(course.getName()).equals("IT");
    }

    @Test
    void testSetNameNull(){
        Exception exception = assertThrows(Exception.class, () -> {
            course.setName("");
        });
        assert(exception.getMessage()).equals("Null values not accepted");
    }

    @Test
    void testSetModuleList(){
        try {
            course.setModuleList(List.of(module2, module3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert(course.getModuleList()).equals(List.of(module2, module3));
    }

    @Test
    void testSetModuleListNull(){
        Exception exception = assertThrows(Exception.class, () -> {
            course.setModuleList(List.of());
        });
        assert(exception.getMessage()).equals("Module list can't be 0");
    }

    @Test
    void testSetStartDate() {
        course.setStartDate(DateTime.parse("2022-01-01"));
        assert(course.getStartDate()).equals(DateTime.parse("2022-01-01"));
    }

    @Test
    void testSetEndDate() {
        course.setEndDate(DateTime.parse("2022-05-03"));
        assert(course.getEndDate()).equals(DateTime.parse("2022-05-03"));
    }
}