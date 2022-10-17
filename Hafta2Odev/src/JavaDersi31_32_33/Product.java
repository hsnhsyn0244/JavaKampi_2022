package JavaDersi31_32_33;

public class Product {
    //atribiute && field
    private int id;
    private  String name ;
    private String descrition;
    private double price;
    private int stackAmount;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStackAmount() {
        return stackAmount;
    }

    public void setStackAmount(int stackAmount) {
        this.stackAmount = stackAmount;
    }

    public String getKod() {
        kod=name.substring(0,2)+id;
        return kod;
    }
}
