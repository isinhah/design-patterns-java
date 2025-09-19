package factory_method.notification_system;

import factory_method.notification_system.factory.NotificationFactory;
import factory_method.notification_system.model.NotificationType;
import factory_method.notification_system.service.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        NotificationService notificationService = new NotificationService(notificationFactory);

        notificationService.sendNotification(NotificationType.EMAIL, "isabel@email.com", "olá");
        notificationService.sendNotification(NotificationType.SMS, "isabel@email.com", "tchau");
    }
}