import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private String condition;

    public Product(int id, String name, double price, String condition) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.condition = condition;
    }

}

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.txt"))) {
            Product product = new Product(1, "IPhone 12", 2800000, "New");
            oos.writeObject(product);
            oos.flush();
            System.out.println("Success!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
