package factory_method.model;

public class SMSNotification extends Notification {

    public SMSNotification(String to, String message) {
        super(to, message);
    }

    @Override
    public void sendMessage() {
        System.out.println("Enviando SMS para " + to + ": " + message);
    }
}
