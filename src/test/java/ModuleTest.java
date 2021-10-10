import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {
    private final List<String> studentList = List.of("A", "B", "C", "D");
    private final List<String> courseList = List.of("ECE", "IT", "BIS");
    private final Module module = new Module("Mathematical Methods", "CT2100", studentList, courseList);

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
        module.setStudentList(List.of("W", "X", "Y", "Z"));
        assert(module.getStudentList()).equals(List.of("W", "X", "Y", "Z"));
    }

    @Test
    void setCourseList() {
        module.setCourseList(List.of("ECE", "IT"));
        assert(module.getCourseList()).equals(List.of("ECE", "IT"));
    }
}