class Hotel_Booking {
    String guestName;
    String roomType;
    int nights;

    Hotel_Booking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
    Hotel_Booking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    Hotel_Booking(Hotel_Booking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        Hotel_Booking h1 = new Hotel_Booking();
        Hotel_Booking h2 = new Hotel_Booking("Rishabh", "Deluxe", 3);
        Hotel_Booking h3 = new Hotel_Booking(h2);

        h1.display();
        System.out.println();
        h2.display();
        System.out.println();
        h3.display();
    }
}