package creational_patterns.abstract_factory.currency_converter.factory;

import creational_patterns.abstract_factory.currency_converter.currency.CurrencyConverter;
import creational_patterns.abstract_factory.currency_converter.formatter.CurrencyFormatter;

public interface CurrencyFactory {
    CurrencyConverter createCurrencyConverter();
    CurrencyFormatter createCurrencyFormatter();
}
