package structural_patterns.decorator.notification_services;

// 2 - Implementação base: define o comportamento padrão de envio de notificações
public class BasicNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Basic notification: " + message);
    }
}
