package creational_patterns.abstract_factory.currency_converter.factory;

import creational_patterns.abstract_factory.currency_converter.currency.CurrencyConverter;
import creational_patterns.abstract_factory.currency_converter.currency.JapanCurrencyConverter;
import creational_patterns.abstract_factory.currency_converter.formatter.CurrencyFormatter;
import creational_patterns.abstract_factory.currency_converter.formatter.JapanCurrencyFormatter;

public class JapanCurrencyFactory implements CurrencyFactory {
    @Override
    public CurrencyConverter createCurrencyConverter() {
        return new JapanCurrencyConverter();
    }

    @Override
    public CurrencyFormatter createCurrencyFormatter() {
        return new JapanCurrencyFormatter();
    }
}