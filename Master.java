public class Master implements Observer{
    private String name;
    int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if(this.salary <= vacancy.getSalary()){
            System.out.printf("Мастер %s: Мне нужна эта работа! (компания %s), ЗП %s \n", name, vacancy.getNameCompany(), vacancy.getSalary());
        }
        else{
            System.out.printf("Мастер %s: Я найду работу получше! (компания : %s;  Заработная плата: %s\n)", name, vacancy.getNameCompany(), vacancy.getSalary());
        }
    }
}
