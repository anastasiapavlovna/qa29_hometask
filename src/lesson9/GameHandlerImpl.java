package lesson9;

import lesson9.exc.BetTooBigExc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GameHandlerImpl implements GameHandler {

    private final Service service;

    public GameHandlerImpl(Service service) {
        this.service = service;
    }

    @Override
    public void run(User user) {

        while (true) {

            System.out.println("input bet");
            Scanner scanner = new Scanner(System.in);
            int bet = scanner.nextInt();
            System.out.println("input number");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Goodbye");
                break;
            }

            if (number < -1 || number > 5) {
                System.out.println("Number can be between 1 and 5");
                continue;
            }

            try {
                service.validate(bet, user);
            } catch (BetTooBigExc exc) {
                System.out.println("error " + exc.getErrorMessage());
                continue;
                }

            var isWin = service.play(number);

            if (isWin) {
                service.change(user, bet, number);
            } else
                user.walletAmount = user.walletAmount - bet;

            System.out.println("Your wallet amount " + user.walletAmount);

        }

    }
}



