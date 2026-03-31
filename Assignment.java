import java.util.*;

class Item {
    private String itemId;
    private String itemName;
    private int quantity;
    private double price;

    public Item(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String toString() {
        return itemId + " | " + itemName + " | Qty: " + quantity + " | Price: " + price;
    }
}
