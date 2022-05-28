package chapterNine;

public class Ave extends Animal{
    @Override
//    public void breath(String withWhat){
      public void breath(){
//        super.breath();
        System.out.println("I am an Ave and i am breathing");
    }
    public void parentBreath(){
        super.breath();
    }
}
