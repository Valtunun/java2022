package overrısıng;


public class overrıdıng {

    public static void main(String[] args) {
       BaseKredimanager[] krediManagers = new BaseKredimanager []{ new OgretmenKredimanager(),new TarımKredimanger(),new OgrenciKrediManager()};
       
       for (BaseKredimanager krediManager : krediManagers){
        System.out.println(krediManager.hesapla(1000));
        
        
        
        
       }






    }
    
    
}
