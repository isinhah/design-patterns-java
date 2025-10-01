package creational_patterns.factory_method.notification_system.model;

public class PushNotification extends Notification {

    public PushNotification(String to, String message) {
        super(to, message);
    }

    @Override
    public void sendMessage() {
        System.out.println("Enviando via PUSH para " + to + ": " + message);
    }
}