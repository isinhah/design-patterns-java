package behavioral_patterns.iterator.email_entry_box;

public class Email {
    private final String subject;

    public Email(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
