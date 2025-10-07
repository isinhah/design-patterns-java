package behavioral_patterns.mediator.message_chat;

public class ChatUser extends User {
    public ChatUser(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " envia: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " recebeu: " + message);
    }
}
