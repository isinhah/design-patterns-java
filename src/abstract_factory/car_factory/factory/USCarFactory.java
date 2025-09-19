package abstract_factory.car_factory.factory;

import abstract_factory.car_factory.car.Car;
import abstract_factory.car_factory.car.USCar;
import abstract_factory.car_factory.document.Document;
import abstract_factory.car_factory.document.USDocument;

public class USCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new USCar();
    }

    @Override
    public Document createDocument() {
        return new USDocument();
    }
}
