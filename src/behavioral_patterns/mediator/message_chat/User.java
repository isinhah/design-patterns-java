package behavioral_patterns.mediator.message_chat;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}