package abstract_factory.currency_converter.formatter;

public class BrazilCurrencyFormatter implements CurrencyFormatter {

    @Override
    public String format(double amount) {
        return String.format("R$%.2f", amount);
    }
}
