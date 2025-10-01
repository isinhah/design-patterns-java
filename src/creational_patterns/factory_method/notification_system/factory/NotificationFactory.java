package creational_patterns.factory_method.notification_system.factory;

import creational_patterns.factory_method.notification_system.model.*;

public class NotificationFactory {

    public Notification createNotification(NotificationType type, String to, String message) {
        return switch (type) {
            case EMAIL -> new EmailNotification(to, message);
            case SMS -> new SMSNotification(to, message);
            case PUSH ->  new PushNotification(to, message);
        };
    }
}