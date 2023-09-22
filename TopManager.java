public class TopManager implements Observer{

    private String name;
    private int salary = 200000;

    public TopManager(String name){
        this.name = name;
    }
    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Топ менеджер %s: Мне нужна эта работа! (компания %s), ЗП %s \n", name, vacancy.getNameCompany(), vacancy.getSalary());
        }
        else{
            System.out.printf("Топ менеджер %s: Я найду работу получше! (компания : %s;  Заработная плата: %s\n)", name, vacancy.getNameCompany(), vacancy.getSalary());
        }
    }
}

