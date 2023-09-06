import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    private static Random rnd = new Random();
    public static Employee generatorWorker(){
        String[] names = new String[] {"Аарон", "Аббас", "Африкан", "Григорий", "Жоан", "Кир", "Прокопий", "Созон", "Фульк", "Яромир"};
        String[] surNames = new String[] {"Авдюнин", "Авлуков", "Аграновский", "Акимычев", "Алешников", "Амстиславский", "Антоник", "Баранчик", "Васюта", "Гамзов"};
        int maxDayWork = 22;
        int minDayWork = 0;
        int freelanceFlag  = rnd.nextInt(0, 2);
        int salaryIndex = rnd.nextInt(200, 500);

        if(freelanceFlag == 1){
            int daysInWorks = rnd.nextInt(minDayWork,maxDayWork);
            return new Freelancer(names[rnd.nextInt(names.length)], surNames[rnd.nextInt(surNames.length)], salaryIndex, true, daysInWorks);
        }
        return new Worker(names[rnd.nextInt(names.length)], surNames[rnd.nextInt(surNames.length)], maxDayWork * salaryIndex, false);
    }

    public static Employee[] generateWorkers(int count) {
        Employee[] workers = new Employee[count];
        for(int i = 0; i < count; i++){
            workers[i] = generatorWorker();
        }
        return workers;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrTypeSort = new String[]{"по Фамилии и имени", "по уровню заработной платы", "по  типу занятости"};

        Employee[] workers = generateWorkers(12);
        boolean flag = true;
        int typeSort = 0;

        while(flag){
            System.out.println("\nУкажите как вы ходите отсортировать список сотрудников \n");
            for(int i = 0; i < arrTypeSort.length; i++){
                System.out.printf("\n %s - %s", i, arrTypeSort[i]);
            }
            System.out.print("\nВаш выбор: ");
            typeSort = scan.nextInt();
            if(typeSort <= arrTypeSort.length && typeSort >= 0){
                System.out.printf("\n Сортируем список сотрудников по %s\n", arrTypeSort[typeSort]);
                flag = false;
            }
        }

        if(typeSort == 0){
            Arrays.sort(workers, new SurNameComporator());
        }
        if(typeSort == 1){
            Arrays.sort(workers, new SalaryComporator());
        }
        if(typeSort == 2){
            Arrays.sort(workers, new TypeWorkComporator());
        }

        for(Employee worker: workers){
            System.out.println(worker.toString());
        }


    }
}
