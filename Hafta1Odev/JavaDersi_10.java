public class JavaDersi_10 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'B':
                System.out.println("Cok guzel geçtiniz");
                break;
            case 'C':
                System.out.println("Guzel geçtiniz");
                break;
            case 'D':
                System.out.println("Devamdan kaldınız");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}
