package creational_patterns.abstract_factory.car_factory.factory;

import creational_patterns.abstract_factory.car_factory.car.Car;
import creational_patterns.abstract_factory.car_factory.document.Document;

public interface CarFactory {
    Car createCar();
    Document createDocument();
}
