public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int refill = 1100;

        int bonus = 0;
        int total = balance + refill;
        if (refill > 1000) {
            bonus = refill / 100;

            total = balance + refill + bonus;

            System.out.println("Ваш бонус составил " + bonus + " руб.");
            System.out.println("Ваш баланс " + total + "руб.");

        } else {
            System.out.println("Ваш баланс " + total + "руб.");


        }
    }
}