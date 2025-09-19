package factory_method.factory;

import factory_method.model.*;

public class NotificationFactory {

    public Notification createNotification(NotificationType type, String to, String message) {
        return switch (type) {
            case EMAIL -> new EmailNotification(to, message);
            case SMS -> new SMSNotification(to, message);
            case PUSH ->  new PushNotification(to, message);
        };
    }
}