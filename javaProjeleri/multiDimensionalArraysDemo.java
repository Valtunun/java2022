public class multiDimensionalArraysDemo {

    public static void main(String[] args) {

       String[][] sehirler = new String[3] [3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "İzmir";
        sehirler[0][2] = "Konya";
        sehirler[1][0] = "nevşehir";
        sehirler[1][1] ="kırklareli";
        sehirler[1][2] ="edirne";
        sehirler[2][0] ="tekirdağ";
        sehirler[2][1] ="mersin";
        sehirler[2][2] ="kırıkkale";

        for (int i=0;i<=2;i++){
            for (int j = 0; j<=2;j++){
                System.out.println(sehirler[i][j]);
            }



        }




    













}

    
}
