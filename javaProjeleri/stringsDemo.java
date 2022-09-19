public class stringsDemo {

    public static void main(String[] args) {
         String mesaj = "  Merhaba Dünya   ";
        /*System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Hoşgeldin"));
        System.out.println(mesaj.startsWith("M"));
        System.out.println(mesaj.endsWith("a"));
        char[] karakterler = new char[8];
        mesaj.getChars(0, 7, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("y"));*/
        System.out.println(mesaj.replace(" ", "-"));
        System.out.println(mesaj.substring(3));
        System.out.println(mesaj.substring(3,10));
        for (String kelime:mesaj.split(" ") ){
            System.out.println(kelime);
    
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());












}


    
}
