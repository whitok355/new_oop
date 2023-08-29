public class Product {
    protected String name;

    protected String brand;

    protected double price;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(){
        this("Noname");
    }

    public Product(String name) {
        this(name, "Noname");
    }

    public Product(String name, String brand) {
        this(name, brand, 100);
    }

    public Product(String name, String brand, double price){
        checkPrice(price);
        checkName(name);
        checkBrand(brand);
    }

    private void checkName(String name){
        if(name.length() < 3 || name == null){
            throw new RuntimeException("Неверно введенное навание наименования");
        } else{
            this.name = name;
        }
    }

    private void checkBrand(String brand){
        if(brand.length() < 3 || brand == null){
            throw new RuntimeException("Неверно введенное наименование брэнда");
        } else{
            this.brand = brand;
        }
    }

    private void checkPrice(double price){
        if(price <= 0){
            throw new RuntimeException("Вы ввели цену товара меньше или равную 0");
        } else{
            this.price = price;
        }
    }

    public String displayInfo(){
        return String.format("[%s] брэнд - %s; цена - %.2f;", name, brand, price);
    }
}
