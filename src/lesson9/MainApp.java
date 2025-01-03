package lesson9;

public class MainApp {
    public static void main(String[] args) {
        User user = new User("Vasya", 100);

        GameHandler gameHandler = new GameHandlerImpl(new ServiceImpl());
        gameHandler.run(user);


    }
}
