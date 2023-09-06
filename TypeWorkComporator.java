import java.util.Comparator;

public class TypeWorkComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2){
        return Boolean.compare(o1.freelanceValue, o2.freelanceValue);
    }
}
