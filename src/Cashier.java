

public class Cashier {
    Command command;
    public void getOrder(Command command) {
        this.command = command;
        command.toOrder();
    }
}
