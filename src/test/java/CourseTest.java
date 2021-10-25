import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.List;

class CourseTest {
    private final Student student1 = new Student("A", 21, DateTime.parse("2000-01-01"));
    private final Student student2 = new Student("B", 22, DateTime.parse("2000-02-02"));
    private final Student student3 = new Student("C", 23, DateTime.parse("2000-03-03"));
    private final Student student4 = new Student("D", 24, DateTime.parse("2000-04-04"));
    private final Student student5 = new Student("E", 25, DateTime.parse("2000-05-05"));
    private final List<Student> studentList1 = List.of(student1, student2, student3);
    private final List<Student> studentList2 = List.of(student1, student3, student5);
    private final List<Student> studentList3 = List.of(student2, student4);
    private final Module module1 = new Module("Mathematical Methods", "CT2100", studentList1);
    private final Module module2 = new Module("Engineering Chemistry", "EE1111", studentList2);
    private final Module module3 = new Module("Engineering Computing", "CT3445", studentList3);
    private final List<Module> moduleList = List.of(module1, module2, module3);
    private final Course course = new Course("ECE", moduleList, DateTime.parse("2021-09-05"), DateTime.parse("2021-12-18"));

    @Test
    void testSetName() {
        course.setName("IT");
        assert(course.getName()).equals("IT");
    }

    @Test
    void testSetModuleList() {
        course.setModuleList(List.of(module2, module3));
        assert(course.getModuleList()).equals(List.of(module2, module3));
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