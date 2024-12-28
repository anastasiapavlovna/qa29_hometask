package lesson8;

public class WindowsPhone extends Phone{
    @Override
    public void firmware() {
        System.out.println("Check software update for Windows");
    }

    @Override
    public void call() {
        System.out.println("Windows get the call");
    }
}
