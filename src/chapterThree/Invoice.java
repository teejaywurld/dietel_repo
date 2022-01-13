package chapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double itemPrice;

    public Invoice(String number, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public void setPartNumber(String newNumber) {
        partNumber = newNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String newDescription) {
        partDescription = newDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setItemQuantity(int newQuantity) {
        if (itemQuantity > 0) {
            itemQuantity = 0;
        }
        itemQuantity = newQuantity;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemPrice(double newPrice) {
        if (itemPrice > 0) {
            itemPrice = 0;
        }
        itemPrice = newPrice;
    }
    public double getItemPrice(){
        return itemPrice;
    }
    public double getInvoiceAmount(){
        return itemPrice * itemQuantity;
    }
}
