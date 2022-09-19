public class recapDemo2 {

    public static void main(String[] args) {
       
        double[] myList = {1.2,5.4,2.3} ;
        double total = 0;
        double max = myList[0];
        for (double mlist : myList){

            if ( max < mlist){
                max = mlist;

            }

            total = total + mlist;
            System.out.println(mlist);
            
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük Sayı = " + max +"' tür");

        

















        
    }
    
}
