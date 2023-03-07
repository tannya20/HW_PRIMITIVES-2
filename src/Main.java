public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; //текущий счет
        int amount = 1100; // входящие монеты
        int isRegisred = 1000;   // при какой сумме начисояются балы


        int percent;
        if (amount >= isRegisred) {
            percent = 1;
        } else {
            percent = 0;
        }

//         int percent = isRegisred ? 1 : 0;

        int bonus = amount  / 100 * percent;
        initialAccount = initialAccount + amount + bonus;
        if (bonus > 500) {
            bonus = 500;
        }

        System.out.println("Ваш баланс: " + initialAccount + "\nНачислено бонусов: " + bonus);
    }


}