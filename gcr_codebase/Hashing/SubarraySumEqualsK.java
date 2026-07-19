import java.util.*;

public class SubarraySumEqualsK {
    public static int subarraySumEqualsK(int[] revenueChanges, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        int runningSum = 0;
        int answer = 0;

        for (int change : revenueChanges) {
            runningSum += change;
            answer += prefixCount.getOrDefault(runningSum - k, 0);
            prefixCount.put(runningSum, prefixCount.getOrDefault(runningSum, 0) + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] revenue = new int[n];
        for (int i = 0; i < n; i++) {
            revenue[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(subarraySumEqualsK(revenue, k));
    }
}