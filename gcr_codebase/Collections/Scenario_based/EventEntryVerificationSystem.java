import java.util.*;

public class EventEntryVerificationSystem {
    static HashSet<String> participants = new HashSet<>();
    static void register(String email) {
        if (participants.add(email))
            System.out.println("Registration Successful.");
        else
            System.out.println("Duplicate Registration Rejected.");
    }
    static void display() {
        System.out.println("\nRegistered Participants:");

        for (String s : participants)
            System.out.println(s);
        System.out.println("Total Participants = " + participants.size());
    }

    public static void main(String[] args) {
        register("aman@gmail.com");
        register("riya@gmail.com");
        register("aman@gmail.com");
        display();
    }
}