package abstract_factory.currency_converter.factory;

import abstract_factory.currency_converter.currency.CurrencyConverter;
import abstract_factory.currency_converter.formatter.CurrencyFormatter;

public interface CurrencyFactory {
    CurrencyConverter createCurrencyConverter();
    CurrencyFormatter createCurrencyFormatter();
}
