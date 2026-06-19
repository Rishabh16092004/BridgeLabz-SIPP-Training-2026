import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expense Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        try {
            FileWriter fw = new FileWriter("expenses.txt", true);
            fw.write(category + " - " + amount);
            fw.write(System.lineSeparator());
            fw.close();
            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving expense.");
        }

        sc.close();
    }
}