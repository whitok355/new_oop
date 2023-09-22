public class Program {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();

        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 90000);

        Student student1 = new Student("Petrov");
        Student student2 = new Student("Ivanov");
        Master master1 = new Master("Popov");
        Master master2 = new Master("Pupkov");
        TopManager topManager1 = new TopManager("Shvili");
        TopManager topManager2 = new TopManager("Sarkisyan");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(topManager1);
        jobAgency.registerObserver(topManager2);

        for(int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }
}
