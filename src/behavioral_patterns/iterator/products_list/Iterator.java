package behavioral_patterns.iterator.products_list;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}