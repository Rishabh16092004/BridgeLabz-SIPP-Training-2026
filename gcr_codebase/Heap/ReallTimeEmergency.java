import java.util.Collections;
import java.util.PriorityQueue;

public class ReallTimeEmergency {

    public static void addPatient(PriorityQueue<Integer> pq, int severity) {
        pq.offer(severity);
        System.out.println("Patient Added : " + severity);
    }
    public static void treatNext(PriorityQueue<Integer> pq) {
        if (pq.isEmpty()) {
            System.out.println("No Patient Available");
            return;
        }
        System.out.println("Treating Patient with Severity : " + pq.poll());
    }

    public static void display(PriorityQueue<Integer> pq) {
        System.out.println(pq);
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        addPatient(pq, 60);
        addPatient(pq, 90);
        addPatient(pq, 30);
        addPatient(pq, 75);

        System.out.println();

        display(pq);

        System.out.println();

        treatNext(pq);
        treatNext(pq);

        System.out.println();

        display(pq);
    }
}