package abstract_factory.currency_converter.factory;

import abstract_factory.currency_converter.currency.BrazilCurrencyConverter;
import abstract_factory.currency_converter.currency.CurrencyConverter;
import abstract_factory.currency_converter.formatter.BrazilCurrencyFormatter;
import abstract_factory.currency_converter.formatter.CurrencyFormatter;

public class BrazilCurrencyFactory implements CurrencyFactory {
    @Override
    public CurrencyConverter createCurrencyConverter() {
        return new BrazilCurrencyConverter();
    }

    @Override
    public CurrencyFormatter createCurrencyFormatter() {
        return new BrazilCurrencyFormatter();
    }
}