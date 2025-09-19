package factory_method.notification_system.service;

import factory_method.notification_system.factory.NotificationFactory;
import factory_method.notification_system.model.Notification;
import factory_method.notification_system.model.NotificationType;

public class NotificationService {

    private final NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void sendNotification(NotificationType type, String to, String message) {
        Notification notification = notificationFactory.createNotification(type, to, message);
        notification.sendMessage();
    }
}