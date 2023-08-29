public class BottleWater extends Product{

    private double volume;

    public double getVolume(){
        return volume;
    }
    public BottleWater(String name, String brand, double price, double volume){
        super(name, brand, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo(){
        return String.format("[%s] брэнд- %s; цена - %.2f; объем - %.2f;", name, brand, price, volume);
    }
}
