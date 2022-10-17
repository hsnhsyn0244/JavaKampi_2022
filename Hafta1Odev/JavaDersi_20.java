public class JavaDersi_20 {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf){
            case 'A':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesliler");
                break;
            default:
                System.out.println("Ince sesliler");
        }
    }
}
