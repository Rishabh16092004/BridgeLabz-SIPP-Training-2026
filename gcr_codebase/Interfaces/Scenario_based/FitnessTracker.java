/* 1.Build a fitness tracker: interfaces Trackable (logActivity()), Reportable
(generateReport()), Notifiable (sendAlert()). Class FitnessDevice
implements all three. Add a default method resetData() to Trackable.
Demonstrate multiple interface implementation Java cannot do with
classes. */

interface Trackable {
    void logActivity();
    default void resetData() {
        System.out.println("Fitness data reset.");
    }
}
interface Reportable{
    void generateReport();
}
interface Notifiable{
    void sendAlert();
}
class FitnessDevice implements Trackable,Reportable,Notifiable{
    @Override
    public void logActivity(){
        System.out.println("Fitness devise log activity.");
    }

    @Override
    public void generateReport(){
        System.out.println("Fitness devise generate report.");
    }

    @Override
    public void sendAlert(){
        System.out.println("Fitness devise send alert.");
    }
}
public class FitnessTracker {
    public static void main(String[] args) {
        FitnessDevice d = new FitnessDevice();
        d.logActivity();
        d.generateReport();
        d.sendAlert();
        d.resetData();
    }
}
