package kodlamaioGithub.polymorphismDemo;

public class Filelogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Dosyaya loglandı" + message);
    }
}