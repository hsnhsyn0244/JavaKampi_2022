import java.util.Scanner;

public class JavaDersi_23 {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 7, 0};
        Scanner scan = new Scanner(System.in);
        int aranacak = scan.nextInt();
        int sayac=0;
        for (int i = 0; i < sayilar.length; i++) {
            if (aranacak==i)
                sayac++;
        }if (sayac == 1) {
            System.out.println("sayi mevcuttur : " + aranacak);
        } else {
            System.out.println("sayi mecut degil : "+aranacak);
        }
    }
}
