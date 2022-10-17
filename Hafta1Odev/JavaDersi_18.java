public class JavaDersi_18 {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj.replace(" ","_"));
        System.out.println(mesaj.substring(6));
        System.out.println(mesaj.substring(6,10));
        System.out.println("------");
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println("-----");
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());// bas ve sondaki bosluk silme

    }
}
