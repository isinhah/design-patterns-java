package abstract_factory.currency_converter.currency;

public class BrazilCurrencyConverter implements CurrencyConverter {
    @Override
    public double convert(double amountInUSD) {
        return amountInUSD * 6;
    }
}
