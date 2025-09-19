package abstract_factory.car_factory.factory;

import abstract_factory.car_factory.car.Car;
import abstract_factory.car_factory.document.Document;

public interface CarFactory {
    Car createCar();
    Document createDocument();
}
