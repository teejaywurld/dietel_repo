package chapterSix;

import chapterEight.Husband;

import chapterEight.Wife;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class HusbandTest {
        @Test
        public void iyawoSnatchingTest(){
           Wife peterWife = new Wife();
           Husband peter = new Husband(peterWife);
           peter.askWifeToCook("Poundo and Egusi with Ogufe");

            BigDecimal bigDecimal = new BigDecimal("1234");
            BigDecimal bigDecimal1 = BigDecimal.valueOf(1234);
        }
    }
