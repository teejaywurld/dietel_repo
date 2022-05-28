package RedoneJavaExercises.ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassStudentTest {
    ClassStudent freshStudent;

    @BeforeEach
    void setUp(){
        freshStudent = new ClassStudent("Adebimpe", "Ademola", 81.90);
    }

    @Test
    void testThatStudentHasAFirstName(){
        freshStudent.setFirstName("Adedayo");
        String firstName = freshStudent.getFirstName();
        assertEquals("Adedayo", firstName);
    }

    @Test
    void testThatStudentHasALastName(){
        freshStudent.setLastName("Adetola");
        String lastName = freshStudent.getLastname();
        assertEquals("Adetola", lastName);
    }

    @Test
    void testThatStudentHasAnAverageInACourse(){
        freshStudent.setAverageScore(89.90);
        double courseScore = freshStudent.getAverageScore();
        assertEquals(89.90, courseScore);
    }

    @Test
    void testThatStudentLetterGradeCanBeDetermined(){
        double letterGrade = freshStudent.getLetterGrade(80.0);
        assertEquals(80.0, letterGrade);
        System.out.println("You scored B");
    }
}

