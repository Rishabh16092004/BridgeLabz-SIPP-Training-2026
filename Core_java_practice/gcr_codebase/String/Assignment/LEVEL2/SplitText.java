import java.util.Scanner;

public class SplitText {

    static String[] splitWords(String text) {

        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (i == text.length() || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] customWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Arrays Equal: " +
                compareArrays(customWords, builtInWords));
    }
}