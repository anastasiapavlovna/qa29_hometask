package lesson9;

import lesson9.exc.BetTooBigExc;

import java.util.Random;

public class ServiceImpl implements Service {
    @Override
    public void validate(int bet, User user) throws BetTooBigExc {
        if (bet > user.walletAmount) {
            throw new BetTooBigExc("Bet is bigger then Wallet amount");
        }
        if (bet > 100) {
            throw new BetTooBigExc("Bet can`t be bigger than 100");
            }
        }


    @Override
    public boolean play(int number) {
        Random random = new Random();
        int randomNumber = random.nextInt(6);

        if (number != randomNumber) {
            System.out.println("You lose");
            return false;
        } else {
            System.out.println("You win");
        }
        return true;

    }

    @Override
    public void change(User user, int bet, int number) {

        user.walletAmount = user.walletAmount + bet;

    }
}
