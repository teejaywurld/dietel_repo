package chapterSix;

public class Katar {
    public static char calculateGradeFor(int score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    public static int calculateCopiesFor(int copy) {
        if (copy >= 1) {
            if (copy < 5) {
                return copy * 2000;
            }
        }
        if (copy >= 5) {
            if (copy < 10) {
                return copy * 1800;
            }
        }
        if (copy >= 10) {
            if (copy < 30) {
                return copy * 1600;
            }
        }
        if (copy >= 30) {
            if (copy < 50) {
                return copy * 1500;
            }
        }
        if (copy >= 50) {
            if (copy < 100) {
                return copy * 1300;
            }
        }
        if (copy >= 100) {
            if (copy < 200) {
                return copy * 1200;
            }
        }
        if (copy >= 200) {
            if (copy < 500) {
                return copy * 1100;
            }
        }

        return copy * 1000;

    }

}
