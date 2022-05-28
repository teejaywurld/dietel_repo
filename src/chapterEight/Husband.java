package chapterEight;

public class Husband {
    private Wife iyawo;
    public Husband(Wife wife){
        iyawo = wife;
    }
    public void askWifeToCook(String cookWhat){
        System.out.println("Begging my wife to cook");
        switch(cookWhat){
            case "Indomie":
                System.out.println("Get lost");
                break;
            case "Poundo":
                System.out.println("Oh sweetheart! On my way Daddy wa!");
                break;
            case "Oha":
                System.out.println("O! ndi m oma");
                break;
            default:iyawo.cook();
        }
    }
}
