import java.util.Scanner;

public class Username_Validator {
    static boolean isValidUsername(String username, int index) {

        if (index == username.length()) {
            return true;
        }
        char ch = username.charAt(index);
        if (ch < 'a' || ch > 'z') {
            return false;
        }
        return isValidUsername(username, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println(isValidUsername(username, 0));
    }
}
