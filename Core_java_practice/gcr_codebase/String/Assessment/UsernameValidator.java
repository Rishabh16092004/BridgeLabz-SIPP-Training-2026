import java.sql.SQLOutput;
import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println(CheckSpace(username));
        CountCharacter(username);
        ToUpperCase(username);
        IsPalindrome(username);
    }
    public static boolean CheckSpace(String username) {
        for(int i = 0; i < username.length(); i++) {
            if(username.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }
    public static void CountCharacter(String username){
        int count = 0;
        for(int i = 0; i < username.length(); i++) {
            if(username.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Total character : "+count);
    }

    public static void ToUpperCase(String username){
        username = username.toUpperCase();
        System.out.println("UpperCase : "+username);
    }

    public static void IsPalindrome(String username){
        int left = 0;
        int right = username.length() - 1;
        boolean palindrome = true;
        while(left < right){
            if(username.charAt(left) != username.charAt(right)){
                palindrome = false;
                System.out.println("Not palindrome : "+username);
                break;
            }
            left++;
            right--;
        }
        if(palindrome){
            System.out.println("Palindrome : "+username);
        }
    }
}
