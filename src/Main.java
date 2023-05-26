public class Main {
    public static void main(String[] args) {

        int amount = 500; // текущий счет клиента
        int add = 1500; // сумма пополнения
        int bonus; // сумма бонуса

        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        int total = amount + add + bonus; // итоговая сумма

        System.out.printf("Итоговая сумма: " + total);
    }
}