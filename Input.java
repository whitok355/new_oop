import java.util.Scanner;

public class Input {

    public String inputFromConsoleName(){
        return prompt("Client name: ");
    }
    public String inputFromConsoleProduct(){
        return prompt("Product: ");
    }
    public int inputFromConsoleQnt(){
        return Integer.parseInt(prompt("Quantity: "));
    }
    public int inputFromConsolePrice(){
        return Integer.parseInt(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
