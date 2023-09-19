import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    //region set methods
    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //endregion set methods

    //region base fields
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    //endregion base fields

    //region constructors
    public Order(){

    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    //endregion constructors

    //region get methods
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }
    //endregion get methods

    @Override
        public String toString(){
            return String.format("Order: %s, %s, %s, %s", clientName, product, qnt, price);
    }
}
