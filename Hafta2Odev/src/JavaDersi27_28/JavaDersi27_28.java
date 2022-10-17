package JavaDersi27_28;

public class JavaDersi27_28 {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();
    }

}
