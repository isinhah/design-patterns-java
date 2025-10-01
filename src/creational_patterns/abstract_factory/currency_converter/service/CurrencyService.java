package creational_patterns.abstract_factory.currency_converter.service;

import creational_patterns.abstract_factory.currency_converter.currency.CurrencyConverter;
import creational_patterns.abstract_factory.currency_converter.factory.CurrencyFactory;
import creational_patterns.abstract_factory.currency_converter.formatter.CurrencyFormatter;

public class CurrencyService {

    private final CurrencyFactory currencyFactory;

    public CurrencyService(CurrencyFactory currencyFactory) {
        this.currencyFactory = currencyFactory;
    }

    public void convertCurrency(double amountInUSD){
        CurrencyConverter currencyConverter = currencyFactory.createCurrencyConverter();
        CurrencyFormatter currencyFormatter = currencyFactory.createCurrencyFormatter();

        currencyConverter.convert(amountInUSD);
        System.out.println(currencyFormatter.format(amountInUSD));
    }
}
