public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int refill = 300;

        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;

            int total = balance + refill + bonus;

            System.out.println("Вы пополнили счет  на " + refill + "руб.");
            System.out.println("Ваш бонус составил " + bonus + " руб.");
            System.out.println("Ваш баланс " + total + "руб.");


        } else {
            System.out.println("Сумма пополнения должна быть более 1000 руб.");
        }


    }
}