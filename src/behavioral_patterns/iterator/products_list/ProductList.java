package behavioral_patterns.iterator.products_list;

public class ProductList implements ProductCollection {
    private final Product[] products;
    private int index = 0;

    public ProductList(Product[] products) {
        this.products = products;
    }

    @Override
    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}
