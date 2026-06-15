import java.util.HashSet;
import java.util.Scanner;

public class SecretMessageValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        Count(code);
        StrongWeak(code);
    }
    public static void Count(String code){
        int vowels  = 0;
        int consonants = 0;
        int digits = 0;
        int specials = 0;
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i)=='a' || code.charAt(i)=='e' || code.charAt(i)=='i' || code.charAt(i)=='o' || code.charAt(i)=='u'){
                vowels++;
            }
            if(!Character.isLetterOrDigit(code.charAt(i))){
                specials++;
            }
            if(Character.isDigit(code.charAt(i))){
                digits++;
            }
            else{
                consonants++;
            }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Specials: " + specials);
    }

    public static void StrongWeak(String code){
        if(code.length()<9){
            System.out.println("Weak password");
            return;
        }
        int digits = 0;
        int specials = 0;
        for(int i = 0; i < code.length(); i++){
            if(!Character.isLetterOrDigit(code.charAt(i))){
                specials++;
            }
            if(Character.isDigit(code.charAt(i))){
                digits++;
            }

        }
        if(digits>=2 && specials>=1){
            System.out.println("Strong password");
        }
    }
}
