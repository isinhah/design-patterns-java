package behavioral_patterns.iterator.email_entry_box;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}