package behavioral_patterns.iterator.products_list;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = { new Product("Laptop"), new Product("Mouse"), new Product("Keyboard") };
        ProductList productList = new ProductList(productsArray);

        Iterator<Product> iterator = productList.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Product: " + product.getName());
        }
    }
}
