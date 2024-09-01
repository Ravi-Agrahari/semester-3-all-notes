// Inventory Management System: 
//     - Design a superclass `Item` with attributes `itemCode`, `itemName`, and `price`.
//     - Create subclasses `PerishableItem` and `NonPerishableItem` that inherit from `Item`.
//     - Add specific attributes such as `expiryDate` for `PerishableItem` and `warrantyPeriod` for `NonPerishableItem`.
//     - Implement a method in each subclass to display item details and check if a perishable item is expired.


class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
}

class PerishableItem extends Item {
    String expiryDate;

    PerishableItem(int itemCode, String itemName, double price, String expiryDate) {
        super(itemCode, itemName, price);
        this.expiryDate = expiryDate;
    }

    void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }

    void checkExpiry() {
        System.out.println("Checking expiry date...");
        // logic to check if the item is expired
    }
}

class NonPerishableItem extends Item {
    int warrantyPeriod;

    NonPerishableItem(int itemCode, String itemName, double price, int warrantyPeriod) {
        super(itemCode, itemName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

public class Project {
    public static void main(String[] args) {
        PerishableItem perishableItem = new PerishableItem(101, "Milk", 25.0, "12/12/2021");
        perishableItem.displayItemDetails();
        perishableItem.checkExpiry();

        NonPerishableItem nonPerishableItem = new NonPerishableItem(201, "Laptop", 50000.0, 2);
        nonPerishableItem.displayItemDetails();
    }
}