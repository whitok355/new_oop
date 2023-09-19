public class Program {
    public static void main(String[] args) {
        Input input = new Input();


        Order order1 = new Order("Ivan", "apple", 3, 100);
        Writer writer1 = new Writer(order1);
        writer1.saveToJson();

        Order order2 = new Order(
                input.inputFromConsoleName(),
                input.inputFromConsoleProduct(),
                input.inputFromConsoleQnt(),
                input.inputFromConsolePrice()
                );

        Writer writer2 = new Writer(order2);
        writer2.saveToJson();

    }
}
