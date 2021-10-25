import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.List;

class ModuleTest {
    private final Student student1 = new Student("A", 21, DateTime.parse("2000-01-01"));
    private final Student student2 = new Student("B", 22, DateTime.parse("2000-02-02"));
    private final Student student3 = new Student("C", 23, DateTime.parse("2000-03-03"));
    private final List<Student> studentList = List.of(student1, student2, student3);
    private final Module module = new Module("Mathematical Methods", "CT2100", studentList);

    @Test
    void testSetName() {
        module.setName("Engineering Maths");
        assert(module.getName()).equals("Engineering Maths");
    }

    @Test
    void testSetId() {
        module.setId("MA1000");
        assert(module.getId()).equals("MA1000");
    }

    @Test
    void testSetStudentList() {
        Student student1 = new Student("D", 24, DateTime.parse("2000-04-04"));
        Student student2 = new Student("E", 25, DateTime.parse("2000-05-05"));
        Student student3 = new Student("F", 26, DateTime.parse("2000-06-06"));
        module.setStudentList(List.of(student1, student2, student3));
        assert(module.getStudentList()).equals(List.of(student1, student2, student3));
    }
}