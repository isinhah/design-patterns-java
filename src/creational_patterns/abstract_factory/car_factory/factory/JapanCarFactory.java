package creational_patterns.abstract_factory.car_factory.factory;

import creational_patterns.abstract_factory.car_factory.car.Car;
import creational_patterns.abstract_factory.car_factory.car.JapanCar;
import creational_patterns.abstract_factory.car_factory.document.Document;
import creational_patterns.abstract_factory.car_factory.document.JapanDocument;

public class JapanCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new JapanCar();
    }

    @Override
    public Document createDocument() {
        return new JapanDocument();
    }
}
