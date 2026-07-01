import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class Addressbook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number. Contact not added.");
            return;
        }
        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);
        System.out.println("Contact Added.");
    }

    public static void search(String name) {
        Contact c = map.get(name);
        if (c != null)
            System.out.println(c.name + " " + c.phone + " " + c.email);
        else
            System.out.println("Contact Not Found.");
    }
    public static void delete(String name) {
        Contact c = map.remove(name);
        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }
    public static void display() {
        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));
        System.out.println("\nContacts:");
        for (Contact c : contacts)
            System.out.println(c.name + " " + c.phone + " " + c.email);
    }

    public static void main(String[] args) {
        addContact("Rohan", "9876543210", "rohan@gmail.com");
        addContact("Aman", "9876500000", "aman@gmail.com");
        addContact("Riya", "9876543210", "riya@gmail.com");
        search("Aman");
        delete("Rohan");
        display();
    }
}