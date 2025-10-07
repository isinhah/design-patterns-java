package behavioral_patterns.surprise_party;

// Concrete observer: implementa o Observer e define o que deve ser feito quando o Subject muda de estado
public class Friend implements Guest {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recebeu aviso: " +  message);
    }
}
