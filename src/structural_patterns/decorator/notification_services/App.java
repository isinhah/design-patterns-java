package structural_patterns.decorator.notification_services;

public class App {
    public static void main(String[] args) {
        Notification notification = new BasicNotification();

        Notification emailNotification = new EmailDecorator(notification);

        Notification smsNotification = new SmsDecorator(notification);

        emailNotification.send("new message");
        smsNotification.send("new message");
    }
}
