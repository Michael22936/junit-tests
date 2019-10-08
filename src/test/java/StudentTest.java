import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student michael;
    private Student matt;
    private Cohort ceres;
    private Student student;
    private Student student1;
    private Student student2;

    @Before
    public void setUp() {
        michael = new Student(1, "Michael");
        matt = new Student(2, "matt");
        student = new Student(1, "mciahel");
        student1 = new Student(2, "mciahel");
        student2 = new Student(3, "mciahel");
        ceres = new Cohort();
        ceres.addStudent(student);
        ceres.addStudent(student1);
        ceres.addStudent(student2);
    }

    @Test
    public void testIfUniqueUser() {

        Student matt = null;

        assertNotNull(michael);

        assertNull(matt);

    }

    @Test
    public void testFieldsSetGet() {

        assertEquals(1, michael.getId());

        assertEquals(michael.getName(), "Michael");

        assertNotNull(michael.getGrades());

    }

    @Test
    public void testIfAddGradesWorks() {

        michael.addGrade(80);

        assertSame(80, michael.getGrades().get(0));

        assertSame(1, michael.getGrades().size());

    }

    @Test
    public void testIfGradeAvgIsCorrect() {

        michael.addGrade(80);

        michael.addGrade(90);

        assertEquals(85, michael.getAverageGrade(), 0);

        matt.addGrade(100);

        assertEquals(100, matt.getAverageGrade(), 0);

    }

    @Test
    public void testIfAddStudentWorks() {
        ceres.addStudent(student);
        assertEquals(1, ceres.getStudents().size());
        ceres.addStudent(student1);
        assertEquals(2, ceres.getStudents().size());
    }

    @Test
    public void testIfCohortAvgIsCorrect() {
        student.addGrade(50);
        student1.addGrade(50);
        student2.addGrade(50);
        assertEquals(50, ceres.getCohortAverage(), 0);
    }

}
