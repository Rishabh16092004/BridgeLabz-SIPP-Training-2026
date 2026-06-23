class circle {
    double radius;

    circle() {
        this(1.0);
    }

    circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle(5);

        c1.display();
        System.out.println();
        c2.display();
    }
}