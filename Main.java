public class Main {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Мурка", 10, false),
                new Cat("Шурик", 30, false),
                new Cat("Бугай", 100, false),
                new Cat("Киса", 5, false),
                new Cat("Ночка", 60, false),
                new Cat("Шарик", 50, false),
        };

        Plate plate = new Plate(100);

        for(Cat cat: cats){
            if(cat.getAppetite() > plate.getFood()){
                cat.errMsg(1);
            }
            if(cat.getAppetite() < plate.getFood()){
                cat.errMsg(2);
            }
            if(cat.getAppetite() == plate.getFood()){
                plate.setFood(plate.getFood()-cat.getAppetite());
                cat.setSatiety(true);
                cat.eat();
                plate.info();
            }
        }
    }
}
