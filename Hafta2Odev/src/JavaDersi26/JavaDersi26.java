package JavaDersi26;

public class JavaDersi26 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava cok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int toplam = topla2(15, 8,2,5);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("guncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    public static int topla2 (int... sayilar){
        int toplam=0;
        for (int sayi: sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
