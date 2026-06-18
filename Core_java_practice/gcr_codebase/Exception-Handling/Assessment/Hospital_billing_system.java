//A hospital billing system must never crash. Wrap division-by-zero
//        (bills with zero items), array out-of-bounds (invalid patient index),
//        and number format exceptions (bad input) with meaningful
//        messages. Create a custom InsufficientFundsException for payment
//        failures.
import java.util.Scanner;

public class Hospital_billing_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bill amount :");
        int bill = sc.nextInt();
        System.out.println("Enter No of items:");
        int item =  sc.nextInt();
        try{
            double avg = bill/item;
            System.out.println(avg);
        }
        catch(Exception e){
            System.out.println(e);
        }

        String[] patient = {"Rishabh","Aman","Sumit","Aryan"};
        System.out.println("Enter index value (0-3): ");
        int idx =  sc.nextInt();
        try{
            System.out.println(patient[idx]);
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            int age = Integer.parseInt(sc.next());
            System.out.println(age);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Invalid numeric input entered.");
        }
    }
}
