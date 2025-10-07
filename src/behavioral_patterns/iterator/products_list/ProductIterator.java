package behavioral_patterns.iterator.products_list;

public class ProductIterator implements Iterator<Product> {
    private final Product[] products;
    private int position = 0;

    public ProductIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return position < products.length && products[position] != null;
    }

    @Override
    public Product next() {
        return products[position++];
    }
}
