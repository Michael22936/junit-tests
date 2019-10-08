import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

   private Student michael;
   private Student matt;

    @Before
    public void setUp(){
        michael = new Student(1, "Michael");
        matt = new Student(2,"matt");
    }

    @Test
    public void testIfUniqueUser(){

        Student matt = null;

        assertNotNull(michael);

        assertNull(matt);

    }

    @Test
    public void testFieldsSetGet(){

        assertEquals(1,michael.getId());

        assertEquals(michael.getName(), "Michael");

        assertNotNull(michael.getGrades());

    }

    @Test
    public void testIfAddGradesWorks(){

        michael.addGrade(80);

        assertSame(80, michael.getGrades().get(0));

        assertSame(1,michael.getGrades().size());

    }

    @Test
    public void testIfGradeAvgIsCorrect(){
        
        michael.addGrade(80);
        
        michael.addGrade(90);

        assertEquals(85,michael.getAverageGrade(), 0);

        matt.addGrade(100);

        assertEquals(100, matt.getAverageGrade(), 0);

    }

}
