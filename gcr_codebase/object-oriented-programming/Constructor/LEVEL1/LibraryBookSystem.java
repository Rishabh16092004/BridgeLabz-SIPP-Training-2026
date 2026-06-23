class Books {
    String title;
    String author;
    double price;
    boolean available;

    Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
    public static void main(String[] args) {
        Books b = new Books("Data Structures", "Mark Allen", 450);
        b.display();
        b.borrowBook();
        b.borrowBook();
    }
}