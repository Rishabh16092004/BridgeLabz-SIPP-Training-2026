class Book1 {
    String title;
    String author;
    double price;

    Book1() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        Book1 b2 = new Book1("Java Programming", "James Gosling", 599);
        b1.display();
        System.out.println();
        b2.display();
    }
}