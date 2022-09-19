public class arraysDemo {

     public static void main(String[] args) {
        String[] ogrenciler = new String[4] ;
        ogrenciler[0] = "emirhan";   
        ogrenciler[1] = "ahmet";
        ogrenciler[2] = "ayşe";
        ogrenciler[3] = "merve";

        for (int i =0;i<ogrenciler.length;i++){

            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------------------------------");

        for (String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        } 





    }

    
}
