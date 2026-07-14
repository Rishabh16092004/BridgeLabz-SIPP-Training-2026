import java.util.*;

public class Server_CPU_Spike_Detection {

    static int maxSum(int[] arr, int k) {
        int start = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end];
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[start];
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter CPU Load:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Window Size: ");
        int k = sc.nextInt();

        System.out.println("Maximum Sum = " + maxSum(arr, k));
    }
}