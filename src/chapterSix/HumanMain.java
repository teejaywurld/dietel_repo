package chapterSix;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Tunji",Gender.MALE);
        human.toString();
        System.out.println(human);
//        Gender.valueOf("HESHE");

        int a = 1;
        int b = 3;
        double sum = (double)a + b;
        System.out.println((double) a);

        System.out.println(sum);
    }
}
