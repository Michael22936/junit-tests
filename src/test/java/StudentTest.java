import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfUniqueUser(){

        Student student = new Student(10000,"Michael");
        assertEquals(student.getId(),10000);
        assertEquals("", student.getName(), "Michael");


    }

}
