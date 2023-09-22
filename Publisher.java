public interface Publisher {
    void sendOffer(Vacancy vacancy);
    void registerObserver(Observer observer);
    void removeObserve(Observer observer);
}
