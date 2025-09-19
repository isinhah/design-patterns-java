package factory_method.model;

public abstract class Notification {

    protected String to;
    protected String message;

    public Notification(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public abstract void sendMessage();
}