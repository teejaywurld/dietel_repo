package RedoneJavaExercises.ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyPrivacyTest {
    CryptographyPrivacy dataEncryption;

    @BeforeEach
    void setUp(){
        dataEncryption = new CryptographyPrivacy();
    }

    @Test
    void testThatFourDigitsCanBeEnteredByTheUser(){
        dataEncryption.setFourDigits(4567);
        int userEntry = dataEncryption.getFourDigits();
        assertEquals(4567, userEntry);
    }

    @Test
    void testThatUserEntryCanBeEncrypted(){
        dataEncryption.setReplacement((double) (4567/1000)+7);
        double entry = dataEncryption.getReplacement();
        assertEquals(11.561, entry);
    }

    @Test
    void testThat(){

    }
}
