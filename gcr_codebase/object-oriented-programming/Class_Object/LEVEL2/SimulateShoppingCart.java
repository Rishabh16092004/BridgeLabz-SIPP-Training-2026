class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added.");
    }
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed.");
        } else {
            System.out.println("Not enough quantity available.");
        }
    }
    void displayTotalCost() {
        System.out.println("Total Cost = " + (price * quantity));
    }
    public static void main(String[] args) {
        CartItem item = new CartItem("Headphones", 1500);
        item.addItem(3);
        item.removeItem(1);
        item.displayTotalCost();
    }
}