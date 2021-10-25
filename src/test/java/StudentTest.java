import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class StudentTest {
    private final Student student = new Student("ABC", 22, DateTime.parse("2000-05-26"));

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