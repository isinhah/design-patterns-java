package creational_patterns.abstract_factory.currency_converter;

import creational_patterns.abstract_factory.currency_converter.factory.BrazilCurrencyFactory;
import creational_patterns.abstract_factory.currency_converter.factory.CurrencyFactory;
import creational_patterns.abstract_factory.currency_converter.factory.JapanCurrencyFactory;
import creational_patterns.abstract_factory.currency_converter.service.CurrencyService;

public class Main {
    public static void main(String[] args) {
        CurrencyFactory brazilFactory = new BrazilCurrencyFactory();
        CurrencyFactory japanFactory = new JapanCurrencyFactory();

        CurrencyService brazilService = new CurrencyService(brazilFactory);
        CurrencyService japanService = new CurrencyService(japanFactory);

        System.out.println("CONVERTENDO DOLAR PARA REAL: ");
        brazilService.convertCurrency(10);

        System.out.println("CONVERTENDO DOLAR PARA IENE: ");
        japanService.convertCurrency(10);
    }
}
