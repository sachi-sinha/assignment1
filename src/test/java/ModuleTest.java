import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertThrows;

class ModuleTest {
    private final Student student1 = new Student("A", 21, DateTime.parse("2000-01-01"), List.of("EE2002", "CT2133", "EE2110"), "ECE");
    private final Student student2 = new Student("B", 22, DateTime.parse("2000-02-02"), List.of("MA111", "CT2002", "MM2133"), "EE");
    private final Student student3 = new Student("C", 23, DateTime.parse("2000-03-03"), List.of("CT3233", "EE1234", "EE2110"), "CS");
    private final List<Student> studentList = List.of(student1, student2, student3);
    private final Module module = new Module("Mathematical Methods", "CT2100", studentList);

    @Test
    void testSetName(){
        try {
            module.setName("Engineering Maths");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert(module.getName()).equals("Engineering Maths");
    }

    @Test
    void testSetNameNull(){
        Exception exception = assertThrows(Exception.class, () -> {
            module.setName("");
        });
        assert(exception.getMessage()).equals("Null values not accepted");
    }

    @Test
    void testSetId() {
        try {
            module.setId("MA1000");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert(module.getId()).equals("MA1000");
    }

    @Test
    void testSetIdNull(){
        Exception exception = assertThrows(Exception.class, () -> {
            module.setId("");
        });
        assert(exception.getMessage()).equals("Id can't be null");
    }

    @Test
    void testSetStudentList() {
        Student student1 = new Student("D", 24, DateTime.parse("2000-04-04"),List.of("EE2002", "CT5555", "CT24244"), "ECE");
        Student student2 = new Student("E", 25, DateTime.parse("2000-05-05"), List.of("CT20012", "CT5787", "MA2131"), "CS" );
        Student student3 = new Student("F", 26, DateTime.parse("2000-06-06"), List.of("EE2002", "CT2133", "EE2110"), "EE");
        module.setStudentList(List.of(student1, student2, student3));
        assert(module.getStudentList()).equals(List.of(student1, student2, student3));
    }
}