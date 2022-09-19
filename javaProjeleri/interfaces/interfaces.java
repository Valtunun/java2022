package interfaces;

public class interfaces {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
      
        customerManager.add();


    }
}
