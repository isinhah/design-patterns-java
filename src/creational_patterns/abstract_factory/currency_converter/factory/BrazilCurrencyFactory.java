package creational_patterns.abstract_factory.currency_converter.factory;

import creational_patterns.abstract_factory.currency_converter.currency.BrazilCurrencyConverter;
import creational_patterns.abstract_factory.currency_converter.currency.CurrencyConverter;
import creational_patterns.abstract_factory.currency_converter.formatter.BrazilCurrencyFormatter;
import creational_patterns.abstract_factory.currency_converter.formatter.CurrencyFormatter;

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