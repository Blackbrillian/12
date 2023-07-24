public class Main {
    public static void main(String[] args) {
        int amount = 200;
        boolean isRegistered = true;
        int percent;
        if (isRegistered) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = amount * percent / 100;
        if (bonus > 100) {
            bonus = 100;
        }
        System.out.println("начисленные Бонусы за покупку:" + bonus);
    }
}