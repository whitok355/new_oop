public abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surName;
    protected double salary;
    protected boolean freelanceValue;

    public abstract double calculateSalary();

    public Employee(String name, String surName, double salary, boolean freelanceValue) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.freelanceValue = freelanceValue;
    }

    @Override
    public int compareTo(Employee o) {
        int surNameResult = surName.compareTo(o.surName);
        if(surNameResult == 0){
            return name.compareTo(o.name);
        }
        return surNameResult;
    }
}
