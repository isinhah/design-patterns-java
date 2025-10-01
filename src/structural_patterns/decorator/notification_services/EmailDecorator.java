package structural_patterns.decorator.notification_services;

public class EmailDecorator implements Notification {
    private Notification notification;

    public EmailDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
        System.out.println("Sending message by Email: " + message);
    }
}
