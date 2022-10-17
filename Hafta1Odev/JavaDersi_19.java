public class JavaDersi_19 {
    public static void main(String[] args) {
       int sayac=0;
       int sayi=97;
       for (int i=1; i<=sayi; i++) {
           if (sayi % i == 0) {
               sayac++;
           }
       }if (sayac == 2) {
            System.out.println("sayi asal : " + sayi);
        } else {
            System.out.println("sayi asal degil : " + sayi);
        }
    }
}
