package staticdemo;

public class ProductManager {
    public void add(Product product){
        ProductValidatör validatör = new ProductValidatör();
        if (validatör.isValid(product)){
            System.out.println("eklendi"); 
        }else{
            System.out.println("ürün bilgileri geçersizdir");
        }
       
    }
}
