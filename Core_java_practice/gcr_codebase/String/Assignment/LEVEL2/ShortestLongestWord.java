import java.util.Scanner;

public class ShortestLongestWord {

    static String[] splitWords(String text) {
        return text.split(" ");
    }

    static String[][] getWordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        return result;
    }

    static int[] findShortestLongest(String[][] arr) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < arr.length; i++) {

            int len = Integer.parseInt(arr[i][1]);

            if (len < Integer.parseInt(arr[shortest][1]))
                shortest = i;

            if (len > Integer.parseInt(arr[longest][1]))
                longest = i;
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = getWordLength(words);

        int[] result = findShortestLongest(data);

        System.out.println("Shortest Word: "
                + data[result[0]][0]);

        System.out.println("Longest Word: "
                + data[result[1]][0]);
    }
}