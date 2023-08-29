public class BottleMilk extends Product{
    private double volume;
    private double fat;

    public double getVolume(){
        return volume;
    }

    public double getFat(){
        return fat;
    }
    public BottleMilk (String name, String brand, double price, double volume, double fat){
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo(){
        return String.format("[%s] брэнд- %s; цена - %.2f; объем - %.2f; жирность - %.2f;", name, brand, price, volume, fat);
    }
}
