package abstract_factory.currency_converter.formatter;

public class JapanCurrencyFormatter implements CurrencyFormatter {

    @Override
    public String format(double amount) {
        return String.format("¥%.2f", amount);
    }
}