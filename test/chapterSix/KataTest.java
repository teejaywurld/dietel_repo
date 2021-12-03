package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

          @Test
            public void aGradeCanBeCalculatedTest(){
              char result = Katar.calculateGradeFor(98);
              assertEquals('A', result);
          }

          @Test
          public void bGradeCanBeCalculatedTest(){
              char result = Katar.calculateGradeFor(89);
              assertEquals('B', result);
          }
          @Test
            public void cGradeCanBeCalculatedTest(){
              char result = Katar.calculateGradeFor(79);
              assertEquals('C', result);
          }
          @Test
            public void dGradeCanBeCalculatedTest(){
              char result = Katar.calculateGradeFor(65);
              assertEquals('D', result);
          }
          @Test
            public void fGradeCanBeCalculatedTest(){
              char result = Katar.calculateGradeFor(59);
              assertEquals('F', result);
          }



            @Test
            public void fourCopiesCanBeCalculatedFor(){
                int copy = 4;
                int price = Katar.calculateCopiesFor(copy);
                assertEquals(copy * 2000, price);
            }
            @Test
            public void eightCopiesCanBeCalculatedFor(){
            int copy = 8;
            int price = Katar.calculateCopiesFor(copy);
            assertEquals(copy * 1800, price);
        }
            @Test
            public void twofiveCopiesCanBeCalculatedFor(){
            int copy = 25;
            int price = Katar.calculateCopiesFor(copy);
            assertEquals(copy * 1600, price);
         }
            @Test
            public void foureightCopiesCanBeCalculatedFor(){
            int copy = 48;
            int price = Katar.calculateCopiesFor(copy);
            assertEquals(copy * 1500, price);
            }
            @Test
            public void nineeightCopiesCanBeCalculatedFor(){
            int copy = 98;
            int price = Katar.calculateCopiesFor(copy);
            assertEquals(copy * 1300, price);
              }
            @Test
            public void oneeightyCopiesCanBeCalculatedFor(){
            int copy = 180;
            int price = Katar.calculateCopiesFor(copy);
            assertEquals(copy * 1200, price);
            }
            @Test
            public void fourninefiveCopiesCanBeCalculatedFor(){
                 int copy = 495;
             int price = Katar.calculateCopiesFor(copy);
             assertEquals(copy * 1100, price);
            }
            @Test
            public void fivezeroCopiesCanBeCalculatedFor(){
             int copy = 550;
            int price = Katar.calculateCopiesFor(copy);
            assertEquals(copy * 1000, price);
    }
        }
