import java.util.Comparator;

public class SurNameComporator implements Comparator<Employee> {

    @Override
        public int compare(Employee o1, Employee o2){
            int surNameRes = o1.surName.compareTo(o2.surName);
            if(surNameRes == 0){
                return o1.name.compareTo(o2.name);
            }
            return surNameRes;
    }
}
