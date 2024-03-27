import java.text.DecimalFormat;
import java.util.Random;

public class Homework18 {
    public static void main(String[] args) {
        Random random = new Random();
        Bank[] banks = new Bank[14];
        String[] bankNames = {"Ощадбанк", "Райффайзен Банк", "УКРСИББАНК", "Сенс Банк",
                "ПРИВАТБАНК", "Сітібанк", "ІНГ Банк Україна", "Укрексімбанк", "УКРГАЗБАНК", "ПУМБ",
                "КРЕДІ АГРІКОЛЬ БАНК", "КРЕДОБАНК", "Банк Кредит Дніпро", "Банк Восток",};
        for (int i = 0; i < banks.length; i++) {
            double exchangeRate = 5*(random.nextDouble()) + 37;
            banks[i] = new Bank(bankNames[i], exchangeRate);
        }
        double bestRate = 0;
        for (Bank bank : banks) {
            if (bestRate < bank.exchangeRate) {
                bestRate = bank.exchangeRate;
            }
        }
        System.out.println("Bank with better exchange rate from USD to UAH is :");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (Bank bank : banks) {
            if (bestRate == bank.exchangeRate) {
                System.out.println(bank.name + ": UAH " + decimalFormat.format(bank.exchangeRate) + " PER 1 USD.");
            }
        }
    }
}