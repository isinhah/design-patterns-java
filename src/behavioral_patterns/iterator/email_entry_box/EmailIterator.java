package behavioral_patterns.iterator.email_entry_box;

public class EmailIterator implements Iterator<Email> {
    private final Email[] emails;
    private int position = 0;

    public EmailIterator(Email[] emails) {
        this.emails = emails;
    }

    @Override
    public boolean hasNext() {
        return position < emails.length && emails[position] != null;
    }

    @Override
    public Email next() {
        return emails[position++];
    }
}
