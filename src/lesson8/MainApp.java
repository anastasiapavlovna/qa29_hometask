package lesson8;

public class MainApp {

    public static void main(String[] args) {

        Phone applePhone = new ApplePhone();
        Phone androidPhone = new AndroidPhone();
        Phone windowsPhone = new WindowsPhone();

        ServiceQuality serviceQuality = new ServiceQuality();

        serviceQuality.check(applePhone);
        System.out.println("-----------------------------");
        serviceQuality.check(androidPhone);
        System.out.println("-----------------------------");
        serviceQuality.check(windowsPhone);

    }
}
