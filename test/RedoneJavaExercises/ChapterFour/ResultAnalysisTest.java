package RedoneJavaExercises.ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultAnalysisTest {
    ResultAnalysis examGrade;

    @BeforeEach
    void setUp() {
        examGrade = new ResultAnalysis();
    }

    @Test
    void testThatStudentsPassesCanBeInitialized() {
        examGrade.setStudentsPasses(0);
        int studentResult = examGrade.getStudentsResult();
        assertEquals(0, studentResult);
    }

    @Test
    void testThatStudentsFailuresCanBeInitialized() {
        examGrade.setStudentsFailures(0);
        int studentResult = examGrade.getStudentsFailures();
        assertEquals(0, studentResult);
    }

    @Test
    void testThatStudentsCounterCanBeInitialized() {
        examGrade.setStudentsCounter(8);
        int studentResult = examGrade.getStudentsCounter();
        assertEquals(8, studentResult);
        }
    }

