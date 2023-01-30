public class Main {
    public static void main(String[] args) {

        int cash = 500; // количество денег на счету
        int amount = 5000; // сумма пополнения
        int bonus; // бонус за пополнение счета более, чем на 1000 рублей
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = cash + amount + bonus; //итоговая сумма
        System.out.println("За пополнение счета более чем на 1000 рублей, Вам будет начислено по 1 рублю за каждые " +
                "полные 100 рублей пополнения.");
        System.out.println("Начислено бонусов:");
        System.out.println(bonus);
        System.out.println("Итоговый счет:");
        System.out.println(total);

    }
}