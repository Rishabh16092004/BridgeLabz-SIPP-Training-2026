import java.util.*;

public class SmartClassroomAttendanceTracker {
    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();
    static void markAttendance(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> list = attendance.get(subject);

        if (!list.contains(student)) {
            list.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate attendance not allowed.");
        }
    }
    static void displayAttendance() {
        System.out.println();
        for (String subject : attendance.keySet()) {

            ArrayList<String> list = attendance.get(subject);
            System.out.println("Subject : " + subject);

            for (String student : list) {
                System.out.println(student);
            }
            System.out.println("Total Students = " + list.size());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Aman");
        markAttendance("Java", "Rohan");
        markAttendance("Java", "Aman");

        markAttendance("Python", "Riya");
        markAttendance("Python", "Aman");

        displayAttendance();
    }
}