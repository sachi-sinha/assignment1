import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class StudentTest {
    private final Student student = new Student("ABC", 22, DateTime.parse("2000-05-26"), List.of("EE2002", "CT2002", "EE2110"), "ECE");

    @Test
    public void testSetName(){
        try {
            student.setName("XYZ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert(student.getName()).equals("XYZ");
    }

    @Test
    void testSetNameNull(){
        Exception exception = assertThrows(Exception.class, () -> {
            student.setName("");
        });
        assert(exception.getMessage()).equals("Null values not accepted");
    }

    @Test
    public void testSetAge() {
        try {
            student.setAge(19);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert(String.valueOf(student.getAge())).equals(String.valueOf(19));
    }

    @Test
    public void testSetAgeLessThan0() {
        Exception exception = assertThrows(Exception.class, () -> {
            student.setAge(-1);
        });
        assert(exception.getMessage()).equals("Age can't be less than 0");
    }

    @Test
    public void testSetDateofBirth(){
        student.setDateOfBirth(DateTime.parse("2000-01-01"));
        assert(student.getDateOfBirth()).equals(DateTime.parse("2000-01-01"));
    }

    @Test
    public void testSetCourse(){
        try {
            student.setCourse("CS");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert(student.getCourse()).equals("CS");
    }

    @Test
    public void testSetCourseNull(){
        Exception exception = assertThrows(Exception.class, () -> {
            student.setCourse("");
        });
        assert(exception.getMessage()).equals("Null values not accepted");
    }

    @Test
    public void testSetModules() {
        try {
            student.setModulesRegistered(List.of("MA1111", "CT1111"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert(student.getModulesRegistered()).equals(List.of("MA1111", "CT1111"));
    }

    @Test
    public void testSetModulesEmptyList(){
        Exception exception = assertThrows(Exception.class, () -> {
            student.setModulesRegistered(List.of());
        });
        assert(exception.getMessage()).equals("No modules registered");
    }

    @Test
    public void testGetStudentUserNamePass(){
        assert(student.getUserName()).equals("ABC" + 22);
    }

    @Test
    public void testGetStudentUserNameFail(){
        assertNotSame(("ABC" + 21), student.getUserName());
    }

    @Test
    public void testGetStudentId(){
        assertNotNull(student.getId());
    }
}