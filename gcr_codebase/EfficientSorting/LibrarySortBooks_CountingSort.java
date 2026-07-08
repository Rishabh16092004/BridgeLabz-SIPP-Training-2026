import java.util.*;

public class LibrarySortBooks_CountingSort {

    static void countingSort(int arr[]) {
        int max = 20;
        int count[] = new int[max + 1];
        for (int x : arr)
            count[x]++;
        int index = 0;
        for (int i = 1; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int genre[] = {5,2,4,1,20,10,2,5,3};
        countingSort(genre);

        System.out.println(Arrays.toString(genre));
    }
}