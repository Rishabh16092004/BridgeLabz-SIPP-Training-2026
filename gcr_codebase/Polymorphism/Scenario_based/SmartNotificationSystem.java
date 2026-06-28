class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }
    void sendNotification() {
    }
}

class EmailNotification extends Notification {
    EmailNotification(String name, String msg) {
        super(name, msg);
    }
    void sendNotification() {
        System.out.println("Email sent to " + recipientName + " : " + message);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String name, String msg) {
        super(name, msg);
    }
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName + " : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String name, String msg) {
        super(name, msg);
    }

    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName + " : " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Rishabh", "Assignment Uploaded"),
                new SMSNotification("Rahul", "OTP:1234"),
                new PushNotification("Amit", "New Offer Available")
        };

        for (Notification n : notifications)
            n.sendNotification();
    }
}
