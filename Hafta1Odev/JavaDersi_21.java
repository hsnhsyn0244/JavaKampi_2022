import java.util.Scanner;

public class JavaDersi_21 {
    public static void main(String[] args) {
      //6

        int toplam=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayiyi gir : ");
        int sayi= scan.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (sayi==toplam){
            System.out.println("sayi mukemmle sayidir : "+ toplam);
        }else {
            System.out.println("sayi mukemmle sayi degildir : "+ toplam);
        }
    }
}
