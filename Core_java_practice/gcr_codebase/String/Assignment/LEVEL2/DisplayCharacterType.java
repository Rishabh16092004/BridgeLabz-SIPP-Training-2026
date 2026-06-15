import java.util.Scanner;

public class DisplayCharacterType {

    static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char) (ch + 32);

        if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u')
            return "Vowel";

        else if (ch >= 'a' && ch <= 'z')
            return "Consonant";

        return "Not a Letter";
    }

    static String[][] analyzeText(String text) {

        String[][] result =
                new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            result[i][0] =
                    String.valueOf(text.charAt(i));

            result[i][1] =
                    checkCharacter(text.charAt(i));
        }

        return result;
    }

    static void display(String[][] arr) {

        System.out.println("Character\tType");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(
                    arr[i][0] + "\t\t" +
                            arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] result = analyzeText(text);

        display(result);
    }
}