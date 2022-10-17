public class JavaDersi_16 {
    public static void main(String[] args) {
        String [][] sehirler= new String[7][3];
        sehirler[0][0]= "Istanbul";
        sehirler[0][1]= "Tekirdag";
        sehirler[0][2]= "Edirne";

        sehirler[1][0]= "Trabzon";
        sehirler[1][1]= "Samsun";
        sehirler[1][2]= "Rize";

        sehirler[2][0]= "Nevsehir";
        sehirler[2][1]= "Kirsehir";
        sehirler[2][2]= "Kayseri";

        sehirler[3][0]= "Izmir";
        sehirler[3][1]= "Cnakkale";
        sehirler[3][2]= "Aydin";

        sehirler[4][0]= "Antalya";
        sehirler[4][1]= "Hatay";
        sehirler[4][2]= "Adana";

        sehirler[5][0]= "Adiyaman";
        sehirler[5][1]= "Urfa";
        sehirler[5][2]= "Malatya";

        sehirler[6][0]= "Elazig";
        sehirler[6][1]= "Van";
        sehirler[6][2]= "Erzurum";

        for (int i=0; i< sehirler.length;i++){
            System.out.println("--------");
            for (int j = 0; j < sehirler[j].length; j++) {
                System.out.print(sehirler[i][j]+" ");
            }
            System.out.println(" ");
        }



    }
}
