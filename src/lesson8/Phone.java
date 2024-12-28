package lesson8;

public abstract class Phone {

    public void call() {
        System.out.println("Get the call");
    }

    public void play() {
        System.out.println("Play music");
    }

    public abstract void firmware();

}
