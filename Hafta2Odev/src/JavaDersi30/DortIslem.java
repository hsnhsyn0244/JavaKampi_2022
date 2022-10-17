package JavaDersi30;

public class DortIslem {
    public int Topla(int... sayilar){
        int toplam=0;
        for (int sayi : sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public int Cikar(int... sayilar){
        int cikar=0;
        for (int sayi : sayilar){
            cikar-=sayi;
        }
        return cikar;
    }
    public int Carp(int... sayilar){
        int carp=1;
        for (int sayi : sayilar){
            carp*=sayi;
        }
        return carp;
    }
    public int Bol(int sayi1, int sayi2){

        return sayi1/sayi2;
    }
}
