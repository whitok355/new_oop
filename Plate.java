public class Plate {

    private int food;
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food){
        this.food = food;
    }

    public void info(){
        System.out.println("\nВ тарелке осталось: " + food +"еды");
    }
}
