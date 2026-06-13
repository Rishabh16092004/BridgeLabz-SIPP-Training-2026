import java.util.Scanner;

public class WordAndLength {

    static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static String[] splitWords(String text) {

        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (i == text.length() || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++)
                    word += text.charAt(j);

                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    static String[][] getWordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = getWordLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < data.length; i++) {

            System.out.println(
                    data[i][0] + "\t" +
                            Integer.parseInt(data[i][1]));
        }
    }
}
