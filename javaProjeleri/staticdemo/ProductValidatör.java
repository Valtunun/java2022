package staticdemo;

public class ProductValidatör {
    public boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
            
        }else{
            return false;
        }
    }
}
