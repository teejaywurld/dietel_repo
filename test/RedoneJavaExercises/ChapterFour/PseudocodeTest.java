package RedoneJavaExercises.ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PseudocodeTest {
    Pseudocode studentScore;

    @BeforeEach
    void setUp() {
        studentScore = new Pseudocode();
    }

    @Test
    void testThatStudentScoreCanBeSet(){
        studentScore.setStudentGrade(3000);
        String studentGrade = studentScore.getStudentGrade();
        assertEquals("F", studentGrade);
    }

}
