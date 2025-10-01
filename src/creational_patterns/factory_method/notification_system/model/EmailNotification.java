package creational_patterns.factory_method.notification_system.model;

public class EmailNotification extends Notification {

    public EmailNotification(String to, String message) {
        super(to, message);
    }

    @Override
    public void sendMessage() {
        System.out.println("Enviando EMAIL para " + to + ": " + message);
    }
}
