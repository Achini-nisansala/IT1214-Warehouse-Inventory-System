import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int qty;

        System.out.print("Enter Item Name: ");
        name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        qty = sc.nextInt();

        System.out.println("\nItem Details");
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + qty);
    }
}
