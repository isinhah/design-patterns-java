package creational_patterns.abstract_factory.car_factory.factory;

import creational_patterns.abstract_factory.car_factory.car.Car;
import creational_patterns.abstract_factory.car_factory.car.USCar;
import creational_patterns.abstract_factory.car_factory.document.Document;
import creational_patterns.abstract_factory.car_factory.document.USDocument;

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
