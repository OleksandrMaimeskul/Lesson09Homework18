public class Bank {
    String name;
    double exchangeRate;


    public Bank(String name, double bestExchangeRate) {
        this.name = name;
        this.exchangeRate = bestExchangeRate;
    }

    @Override
    public String toString() {
        return "bank{" +
                "name='" + name + '\'' +
                ", bestExchangeRate=" + exchangeRate +
                '}';
    }
}
