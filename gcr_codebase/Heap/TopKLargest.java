import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class TopKLargest {

    public static ArrayList<Integer> topKLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            }
            else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }
        ArrayList<Integer> result = new ArrayList<>(minHeap);

        Collections.sort(result, Collections.reverseOrder());
        return result;
    }

    public static void main(String[] args) {

        int[] transactions = {45, 10, 90, 30, 80, 100, 60};
        int k = 3;

        ArrayList<Integer> ans = topKLargest(transactions, k);

        System.out.println("Top " + k + " Largest Elements:");
        System.out.println(ans);
    }
}