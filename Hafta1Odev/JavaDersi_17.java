public class JavaDersi_17 {
    public static void main(String[] args) {
       String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj);

        System.out.println("Kelime Sayisi : "+ mesaj.length());
        System.out.println("5. elaman : "+ mesaj.charAt(4));
        // Stringe veri ekleme
        System.out.println(mesaj.concat(" Yasasin !"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("l"));

        char [] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("u"));
        System.out.println(mesaj.lastIndexOf("u"));
        System.out.println(mesaj.replace(" ","_"));
    }
}
