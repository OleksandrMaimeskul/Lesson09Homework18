import java.text.DecimalFormat;
import java.util.Random;

public class Homework18 {
    public static void main(String[] args) {
        Random random = new Random();
        Bank[] banks = new Bank[5];
        String[] bankNames = {"АТ \"Ощадбанк\"", "АТ \"Райффайзен Банк\"", "АТ \"УКРСИББАНК\"", "АТ \"Ощадбанк\"",
                "АТ КБ \"ПРИВАТБАНК\""};
        for (int i = 0; i < banks.length; i++) {
            double exchangeRate = random.nextDouble(5) + 37;
            banks[i] = new Bank(bankNames[i], exchangeRate);
        }
        double bestRate = Double.MAX_VALUE;
        for (Bank bank : banks) {
            if (bestRate > bank.exchangeRate) {
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