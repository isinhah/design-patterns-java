package creational_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();

        logger1.log("aplicação iniciada");
        logger2.log("testando a aplicação");
    }
}
