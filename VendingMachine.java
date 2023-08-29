import java.util.List;
public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleWater getBottleWater (String name, double volume){
        for(Product product: products){
            if(product instanceof BottleWater){
                BottleWater bottleWater = (BottleWater) product;
                if(bottleWater.getName().equals(name) && bottleWater.getVolume() == volume){
                    return bottleWater;
                }
            }
        }
        return null;
    }

    public Fruit getFruit (String name, double price){
        for(Product product: products){
            if(product instanceof Fruit){
                Fruit fruit = (Fruit) product;
                if(fruit.getName().equals(name) && fruit.getPrice() == price){
                    return fruit;
                }
            }
        }
        return null;
    }

    public BottleMilk getBottleMilk(double volume, double fat){
        for(Product product : products){
            if(product instanceof BottleMilk){
                BottleMilk bottleMilk = (BottleMilk) product;
                if(bottleMilk.getVolume() == volume && bottleMilk.getFat() == fat ){
                    return bottleMilk;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String color, Boolean topping){
        for(Product product : products){
            if(product instanceof Chocolate){
                Chocolate chocolate = (Chocolate) product;
                if(chocolate.getColor().equals(color) && chocolate.getTopping() == topping){
                    return chocolate;
                }
            }
        }
        return null;
    }
}
