package abstract_factory.car_factory;

import abstract_factory.car_factory.factory.JapanCarFactory;
import abstract_factory.car_factory.factory.USCarFactory;
import abstract_factory.car_factory.service.CarService;

public class Main {
    public static void main(String[] args) {
        CarService carUsaService = new CarService(new USCarFactory());
        CarService carJapanService = new CarService(new JapanCarFactory());

        carUsaService.createCarWithDocuments();
        carJapanService.createCarWithDocuments();
    }
}
