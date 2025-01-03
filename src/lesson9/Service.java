package lesson9;

public interface Service {

    void validate(int bet, User user);
    boolean play(int number);
    void change(User user, int bet, int number);
}
