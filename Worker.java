public class Worker extends Employee{

    public Worker(String name, String surName, double salary, boolean freelanceValue) {
        super(surName, name, salary, freelanceValue);
    }
    @Override
    public String toString(){
        return String.format("%s %s, не работает на фрилансе. В этом месяце его доход составляет %s ", surName, name, calculateSalary());
    }
    @Override
    public double calculateSalary(){
        return salary;
    };
}
