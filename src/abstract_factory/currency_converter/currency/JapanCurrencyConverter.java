package abstract_factory.currency_converter.currency;

public class JapanCurrencyConverter implements CurrencyConverter {
    @Override
    public double convert(double amountInUSD) {
        return amountInUSD * 140;
    }
}