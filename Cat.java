public class Cat {
    private final String name;

    private final int appetite;

    private Boolean satiety;

    public Boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
    public Cat(String name, int appetite, Boolean satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void errMsg(int errType){
        if(errType == 1){
            System.out.printf("\nПорция слишком маленькая для %s", name);
        }
        if(errType == 2) {
            System.out.printf("\nПорция слишком большая для %s", name);
        }

    }
    public Boolean eat(){
        if(satiety){
            System.out.printf("\n%s съела порцию и теперь полностью сыт %s", name, satiety);
            return true;
        }
        return false;
    }
}
