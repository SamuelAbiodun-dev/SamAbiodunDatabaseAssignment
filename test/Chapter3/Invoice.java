package Chapter3;

public class Invoice {
private String partId;
private String partDescription;
private int quantityOfItemPurchased;
private double pricePerItem;

public Invoice(String partId, String description, int quantity, double price){
    this.partId = partId;
    this.partDescription = description;
    this.quantityOfItemPurchased = quantity;
    this.pricePerItem = price;
}
public void setPartId(String partId){
    this.partId = partId;
}
public String getPartId(){
    return partId;
}

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityOfItemPurchased() {
        return quantityOfItemPurchased;
    }

    public void setQuantityOfItemPurchased(int quantityOfItemPurchased) {
        this.quantityOfItemPurchased = quantityOfItemPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public double getInvoiceAmount(){
    double calculateTotalAmount;
    calculateTotalAmount = quantityOfItemPurchased * pricePerItem;
    return calculateTotalAmount;
    }
}

