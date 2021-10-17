import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.List;

class CourseTest {
    private final List<String> moduleList = List.of("CT1100", "CT1101", "CT2020");
    private final List<String> studentList = List.of("U", "V", "W", "X");
    private final Course course = new Course("ECE", moduleList, studentList, DateTime.parse("2021-09-05"), DateTime.parse("2021-12-18"));

    @Test
    void testSetName() {
        course.setName("IT");
        assert(course.getName()).equals("IT");
    }

    @Test
    void testSetModuleList() {
        course.setModuleList(List.of("MA2102", "CT2090"));
        assert(course.getModuleList()).equals(List.of("MA2102", "CT2090"));
    }

    @Test
    void testSetStudentList() {
        course.setStudentList(List.of("G", "H", "I"));
        assert(course.getStudentList()).equals(List.of("G", "H", "I"));
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