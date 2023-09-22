import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {
    private Random rnd = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxsalary;
    String[] vacancyList = new String[]{"Manager", "Frontend", "Backend", "Street sweeper", "Assistant", "Secretary"};
    public Company(String name, Publisher jobAgency, int maxsalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxsalary = maxsalary;
    }
    private Vacancy getVacancy(){
        return new Vacancy(vacancyList[rnd.nextInt(vacancyList.length)], name, rnd.nextInt(maxsalary));
    }
    public void needEmployee(){
        jobAgency.sendOffer(getVacancy());
    }
}
