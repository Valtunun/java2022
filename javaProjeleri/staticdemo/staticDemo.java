package staticdemo;

public class staticDemo {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 20;
        product.name = "Asus";
        manager.add(product);
    }
}
