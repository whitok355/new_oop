import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] arrName = {"Apple", "Orange", "Pineapple", "Banana", "Apricot", "Berry", "Cashew", "Chocolate"};
        String[] arrBrand = {"Alice Graden", "Богородские фрукты", "OPC", "Russ-Fruit", "Africana", "Fresh"};
        String[] arrColor = {"White", "Black", "Brown"};
        String[] arrBottle = {"Water", "Milk"};
        Scanner scan = new Scanner(System.in);

        List<Product> arrProduct = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            String randName = arrName[getRandomNumber(arrName.length)];
            String randBrand = arrBrand[getRandomNumber(arrBrand.length)];
            double randPrice = getRandomPrice(50, 1000);
            if(randName.equals("Chocolate")){
                int randColories = getRandomColories(350, 600);
                String randColor = arrColor[getRandomNumber(arrColor.length)];
                Boolean randTopping = getRandomNumber(1) == 1 ? true : false;
                Product chocolate = new Chocolate(randName, randBrand, randPrice, randColories, randColor, randTopping);
            } else{
                Product fruit = new Fruit(randName, randBrand, randPrice);
                arrProduct.add(fruit);
            }

        }

        for(int i = 0; i < 20; i++){
            String randName = arrBottle[getRandomNumber(arrBottle.length)];
            String randBrand = arrBrand[getRandomNumber(arrBrand.length)];
            double randPrice = getRandomPrice(50, 10000);
            double randVolume = getRandomValume(0.5, 5);
            if(randName.equals("Milk")){
                double randomFat = getRandomFat(1.5, 3.5);
                Product bottleMilk = new BottleMilk(randName, randBrand, randPrice,randVolume, randomFat);
                arrProduct.add(bottleMilk);
            } else {
                Product bottleWater = new BottleWater(randName, randBrand, randPrice, randVolume);
                arrProduct.add(bottleWater);
            }
        }

        for(Product product: arrProduct){
            System.out.println(product.displayInfo());
        }

        VendingMachine vendingMachine = new VendingMachine(arrProduct);

        System.out.println("Укажите какой товар Вы хотите купить: 1 - Фрукты 2 - Вода 3- Молоко 4- Шоколад");

        int typeProduct = scan.nextInt();

        arrProduct.add(new Fruit("Apple", "OPC", 100.00));
        arrProduct.add(new Chocolate("Chocolate", "OPC", 100.00, 500, "White", true));
        arrProduct.add(new BottleMilk("Milk", "OPC", 100.00, 1.5, 2.5));
        arrProduct.add(new BottleWater("Water", "OPC", 100.00, 1.5));

        if(typeProduct == 1){
            Fruit fruit = vendingMachine.getFruit("Apple", 100);
            if(fruit != null){
                System.out.println(fruit.displayInfo());
            } else{
                System.out.print("Такого товара не найдено");
            }
        } else if (typeProduct == 2) {
            BottleWater bottleWater = vendingMachine.getBottleWater("Water", 1.5);
            if(bottleWater != null){
                System.out.println(bottleWater.displayInfo());
            } else{
                System.out.print("Такого товара не найдено");
            }
        } else if (typeProduct == 3) {
            BottleMilk bottleMilk = vendingMachine.getBottleMilk(1.5, 2.5);
            if(bottleMilk != null){
                System.out.println(bottleMilk.displayInfo());
            } else{
                System.out.print("Такого товара не найдено");
            }
        } else if (typeProduct == 4) {
            Chocolate chocolate = vendingMachine.getChocolate("White", true);
            if(chocolate != null){
                System.out.println(chocolate.displayInfo());
            } else{
                System.out.print("Такого товара не найдено");
            }
        }

    }

        private static int getRandomNumber(int length){
            Random rand = new Random();
            return rand.nextInt(length);
        }
        private static double getRandomPrice(int min, int max){
            Random rand = new Random();
            return (Math.round((min + (max-min) * rand.nextDouble())*100)/100.0);
        }

        private static double getRandomValume(double min, double max){
            Random rand = new Random();
            return (Math.round((min + (max-min) * rand.nextDouble())*10)/10.0);
        }

        private static double getRandomFat(double min, double max){
            Random rand = new Random();
            return (Math.round((min + (max-min) * rand.nextDouble())*10)/10.0);
        }
        private static int getRandomColories(int min, int max){
            Random rand = new Random();
            return rand.nextInt(min, max);
        }

}