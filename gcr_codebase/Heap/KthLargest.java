import java.util.PriorityQueue;

public class KthLargest {

    public static int findKthLargest(int[] arr, int k) {
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
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] scores = {45, 10, 90, 30, 80, 100, 60};
        int k = 3;
        int ans = findKthLargest(scores, k);
        System.out.println(k + "rd Largest Element = " + ans);
    }
}