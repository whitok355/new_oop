public class Freelancer extends Employee{

    private final int daysInWorks;
    public Freelancer(String name, String surName, double salary, boolean freelanceValue, int daysInWorks) {
        super(name, surName, salary, freelanceValue);
        this.daysInWorks = daysInWorks;
    }

    @Override
    public String toString(){
        return String.format("%s %s, работает на фрилансе. В этом месяце он отработал %s дней и его доход составляет %s ", surName, name, daysInWorks, calculateSalary());
    }
    @Override
        public double calculateSalary(){
            return salary * daysInWorks;
    };
}
