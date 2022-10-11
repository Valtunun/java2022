package kodlamaioGithub.classesWithAttributes;

public class classesWithAttributes {
    public static void main(String[] args) {
        Product product = new Product(5, "Emirhan", "asus", 5, 10);

        ProductManager productManager = new ProductManager();

        //product.setName("Emirhan");

        
        productManager.Add(product);
    }
}
