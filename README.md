IT1214-Warehouse-Inventory-System

Project Description:

This project is a simple Warehouse Inventory Management System developed using Java and the Java Collections Framework.
The system allows users to manage inventory items efficiently through a console-based menu interface. 
It demonstrates the use of Object-Oriented Programming principles such as encapsulation.

Features:

- Add new items to inventory
- Remove items
- Update item quantity
- Search items by ID or Name
- Display all inventory items
- Handle invalid inputs

Technologies Used:

- Java
- Java Collections Framework (HashMap)

--How to Run the Program--

Compile:
javac Warehouse.java

Run:
java Warehouse 

Sample Output:

--- Warehouse Menu ---
1. Add Item
2. Remove Item
3. Update Quantity
4. Search Item
5. View Inventory
6. Exit
Choose option: 1

Enter ID: I001
Enter Name: Laptop
Enter Quantity: 10
Enter Price: 1500
Item added successfully!

--- Warehouse Menu ---
Choose option: 5

ID: I001, Name: Laptop, Quantity: 10, Price: 1500.0

--- Warehouse Menu ---
Choose option: 3

Enter ID: I001
Enter new quantity: 20
Quantity updated.

--- Warehouse Menu ---
Choose option: 4
1. Search by ID
2. Search by Name
Enter choice: 2
Enter Name: Laptop

ID: I001, Name: Laptop, Quantity: 20, Price: 1500.0

--- Warehouse Menu ---
Choose option: 2
Enter ID to remove: I001
Item removed.

--- Warehouse Menu ---
Choose option: 6
Exiting...
