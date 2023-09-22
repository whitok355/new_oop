public class Vacancy {
    public Vacancy(String name, String nameCompany, int salary) {
        this.name = name;
        this.nameCompany = nameCompany;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String name;
    private String nameCompany;
    private int salary;

}
