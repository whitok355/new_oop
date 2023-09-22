import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    List<Observer> observers = new ArrayList<>();
    @Override
    public void sendOffer(Vacancy vacancy) {
        for(Observer observer: observers){
            observer.receiveOffer(vacancy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserve(Observer observer) {
        observers.remove(observer);
    }
}
