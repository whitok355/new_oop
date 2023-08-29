public class Chocolate extends Product{
    private int calories;
    private String color;
    private Boolean topping;

    public int getCalories() {
        return calories;
    }

    public String getColor() {
        return color;
    }

    public Boolean getTopping() {
        return topping;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTopping(Boolean topping) {
        this.topping = topping;
    }


    public Chocolate(String name, String brand, double price, int calories, String color, Boolean topping){
        super(name, brand, price);
        this.calories = calories;
        this.color = color;
        this.topping = topping;
    }

    @Override
    public String displayInfo(){
        return String.format("[%s] брэнд - %s; цена - %.2f; калорийность - %s; цвет - %s; начинка - %s", name, brand, price, calories, color, topping);
    }
}
