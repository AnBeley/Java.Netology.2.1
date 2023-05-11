public class Main {
    public static void main(String[] args) {

        int account = 100;
        int payment = 300;
        int bonus = payment / 100;
        boolean replenish = payment > 1000;

        int amount;
        if (replenish) {
            amount = account + payment + bonus;
        } else {
            amount = account + payment;
            bonus = 0;
        }
        System.out.println("Итоговый счет: " + amount);
        System.out.println("Количество бонусов: " + bonus);
    }
}