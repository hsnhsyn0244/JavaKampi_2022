public class JavaDersi_14 {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Hasan";
        ogrenciler[1] = "Huseyin";
        ogrenciler[2] = "Koruturk";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
