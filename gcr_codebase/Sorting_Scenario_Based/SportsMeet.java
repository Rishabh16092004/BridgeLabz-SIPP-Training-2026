import java.util.Arrays;

public class SportsMeet {

    public static void bubbleSort(int[] arr) {
        int swaps = 0;
        boolean sorted;

        for (int i = 0; i < arr.length - 1; i++) {
            sorted = true;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    sorted = false;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (sorted) {
                System.out.println("Already Sorted (Best Case)");
                break;
            }
        }

        System.out.println("Total Swaps = " + swaps);
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11};

        int[] bubble = scores.clone();
        int[] insertion = scores.clone();

        System.out.println("Bubble Sort");
        bubbleSort(bubble);

        System.out.println("\nInsertion Sort");
        insertionSort(insertion);

        int n = insertion.length;

        System.out.println("\nTop 3 Medalists");
        System.out.println("Gold   : " + insertion[n - 1]);
        System.out.println("Silver : " + insertion[n - 2]);
        System.out.println("Bronze : " + insertion[n - 3]);
    }
}