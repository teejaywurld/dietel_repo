package RedoneJavaExercises.ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {
    GasMileage tripRecord;

    @BeforeEach
    void setUp(){
        tripRecord = new GasMileage();
    }

    @Test
    void testThatMilesDrivenCanBeInputted(){
        tripRecord.setMilesDriven(56);
        int milesDriven = tripRecord.getMilesDriven();
        assertEquals(56, milesDriven);
    }

    @Test
    void testThatGallonsUsedCanBeInputted(){
        tripRecord.setGallonsUsed(78);
        int gallonsUsed = tripRecord.getGallonsUsed();
        assertEquals(78, gallonsUsed);
    }

    @Test
    void testThatMilesPerGallonCanBeCalculated(){
        tripRecord.setTotalMilesDriven(56);
        int totalMilesDriven = tripRecord.getTotalMilesDriven();
        assertEquals(56, totalMilesDriven);
    }

    @Test
    void testThatGallonsPerMileCanBeCalculated(){
        tripRecord.setTotalGallonsUsed(86);
        int totalGallonsUsed = tripRecord.getTotalGallonsUsed();
        assertEquals(86, totalGallonsUsed);
    }
}
