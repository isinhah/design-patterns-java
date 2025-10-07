package behavioral_patterns.mediator.message_chat;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User ana = new ChatUser("ana", mediator);
        User isabel = new ChatUser("isabel", mediator);
        User joao = new ChatUser("joao", mediator);

        mediator.addUser(ana);
        mediator.addUser(isabel);
        mediator.addUser(joao);

        ana.send("Oi pessoal!");
        isabel.send("Olá ana!");
    }
}

