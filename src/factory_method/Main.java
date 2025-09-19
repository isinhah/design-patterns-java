package factory_method;

import factory_method.factory.NotificationFactory;
import factory_method.model.NotificationType;
import factory_method.service.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        NotificationService notificationService = new NotificationService(notificationFactory);

        notificationService.sendNotification(NotificationType.EMAIL, "isabel@email.com", "olá");
        notificationService.sendNotification(NotificationType.SMS, "isabel@email.com", "tchau");
    }
}