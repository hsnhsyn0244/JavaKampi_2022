package JavaDersi31_32_33;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescrition("Asus Laptop");
        product.setPrice(7500.00);
        product.setStackAmount(32);
        product.getKod();

        ProductManager productManager= new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
