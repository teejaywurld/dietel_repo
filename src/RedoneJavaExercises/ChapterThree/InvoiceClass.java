package RedoneJavaExercises.ChapterThree;

public class InvoiceClass {
    private String partNumber;
    private String storeDescription;
    private int quantityDescription;
    private double itemPrice;

    public InvoiceClass(String partNumber, String storeDescription, int quantityDescription, double itemPrice) {
        this.partNumber = partNumber;
        this.storeDescription = storeDescription;
        this.quantityDescription = quantityDescription;
        this.itemPrice = itemPrice;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setQuantityDescription(int quantityDescription) {
        this.quantityDescription = quantityDescription;
    }

    public int getQuantityDescription() {
        return quantityDescription;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getInvoiceAmount() {
        if (quantityDescription < 0) {
            return quantityDescription = 0;
        }
        {
            if (itemPrice < 0.0) {
                return itemPrice = 0.0;

            } else
                return quantityDescription * itemPrice;
        }

    }
}
