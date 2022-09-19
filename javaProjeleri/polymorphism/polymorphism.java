package polymorphism;

public class polymorphism {
    public static void main(String[] args) {
      /*BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger() };
        for (BaseLogger logger :loggers){
            logger.Log("log mesajı"); 
        }*/
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();




     }


 }
