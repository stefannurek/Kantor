package Kantor;

public class Main {

    public static void main(String[] args) {

        double d = CurrencyConverter.convert(
                Currency.EUR, Currency.PLN);

        System.out.println(d);

        ExchangeOffice exchangeOffice = new ExchangeOffice(10000.00);
        exchangeOffice.showFunds();

        exchangeOffice.exchange(100, Currency.PLN, Currency.EUR);

        exchangeOffice.showFunds();
    }
}
