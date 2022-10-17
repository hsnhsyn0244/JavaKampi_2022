package JavaDersi24;

public class JavaDersi24 {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int sayilar[] = new int[]{1, 23, 6, 9, 8};
        boolean varMi = true;
        int aranacak = 5;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("sayi Mevcuttur : " + aranacak);
        } else {
            mesajVer("sayı mevcut değildir : " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
