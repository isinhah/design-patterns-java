package behavioral_patterns.iterator.email_entry_box;

public class Inbox implements EmailCollection {
    private final Email[] emails;

    public Inbox(Email[] emails) {
        this.emails = emails;
    }

    @Override
    public Iterator<Email> createIterator() {
        return new EmailIterator(emails);
    }
}
