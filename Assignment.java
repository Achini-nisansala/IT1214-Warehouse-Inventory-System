import java.util.*;

// Item class
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

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ID: " + itemId +
               ", Name: " + itemName +
               ", Quantity: " + quantity +
               ", Price: " + price;
    }
}


// Inventory class
class Inventory {
    private HashMap<String, Item> items = new HashMap<>();

    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added successfully!");
    }

    public void removeItem(String itemId) {
        if (items.containsKey(itemId)) {
            items.remove(itemId);
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found!");
        }
    }

    public void updateQuantity(String itemId, int quantity) {
        if (items.containsKey(itemId)) {
            items.get(itemId).setQuantity(quantity);
            System.out.println("Quantity updated.");
        } else {
            System.out.println("Item not found!");
        }
    }

    public void searchById(String itemId) {
        if (items.containsKey(itemId)) {
            System.out.println(items.get(itemId));
        } else {
            System.out.println("Item not found!");
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Item item : items.values()) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items.values()) {
                System.out.println(item);
            }
        }
    }
}


// Main class
public class Warehouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Warehouse Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item");
            System.out.println("5. View Inventory");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.addItem(new Item(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    inventory.removeItem(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();

                    inventory.updateQuantity(updateId, newQty);
                    break;

                case 4:
                    System.out.println("1. Search by ID");
                    System.out.println("2. Search by Name");
                    int searchChoice = sc.nextInt();
                    sc.nextLine();

                    if (searchChoice == 1) {
                        System.out.print("Enter ID: ");
                        inventory.searchById(sc.nextLine());
                    } else {
                        System.out.print("Enter Name: ");
                        inventory.searchByName(sc.nextLine());
                    }
                    break;

                case 5:
                    inventory.displayAll();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
