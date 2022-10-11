package kodlamaioGithub.polymorphismDemo;

public class EmailLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Email e loglandı"+ message);
    }
}