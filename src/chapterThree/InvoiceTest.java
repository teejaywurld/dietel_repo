package chapterThree;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice hardwareStore = new Invoice("2112", "Online Shopping", 8, 85_000);
        System.out.println("Part number: " + hardwareStore.getPartNumber() + "; Part description: " + hardwareStore.getPartDescription()
                + "; Sales: " + hardwareStore.getItemQuantity() + "; Price: " + hardwareStore.getItemPrice() + "; " +
                "Invoice amount: " + hardwareStore.getInvoiceAmount());
        hardwareStore.setPartNumber("21XX756");
        hardwareStore.setPartDescription("Mofiyinfoluwa Enterprises");
        hardwareStore.setItemQuantity(5500);
        hardwareStore.setItemPrice(100_500);
        System.out.println("After Sales: ");
        System.out.println("Part number: " + hardwareStore.getPartNumber() + "; Part description: " + hardwareStore.getPartDescription()
                + "; Sales: " + hardwareStore.getItemQuantity() + "; Price: " + hardwareStore.getItemPrice() + "; " +
                "           Invoice amount: " + hardwareStore.getInvoiceAmount());


        System.out.println();
    }
}
