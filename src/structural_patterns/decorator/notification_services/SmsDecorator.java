package structural_patterns.decorator.notification_services;

public class SmsDecorator implements Notification {
    private Notification notification;

    public SmsDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
        System.out.println("Sending message by SMS: " + message);
    }
}
