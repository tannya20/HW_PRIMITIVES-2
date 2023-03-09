public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; //текущий счет
        int amount = 1100; // входящие монеты
        int sum = 1000;   // при какой сумме начисояются балы


        int percent;
        if (amount >= sum) {
            percent = 1;
        } else {
            percent = 0;
        }

//         int percent = sum ? 1 : 0;

        int bonus = amount / 100 * percent;
        initialAccount = initialAccount + amount + bonus;


        System.out.println("Ваш баланс: " + initialAccount + "\nНачислено бонусов: " + bonus);
    }


}