package creational_patterns.abstract_factory.car_factory.service;

import creational_patterns.abstract_factory.car_factory.car.Car;
import creational_patterns.abstract_factory.car_factory.document.Document;
import creational_patterns.abstract_factory.car_factory.factory.CarFactory;

public class CarService {

    private final CarFactory carFactory;

    public CarService(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public void createCarWithDocuments() {
        Car car = carFactory.createCar();
        Document document = carFactory.createDocument();

        car.assemble();
        document.issue();
    }
}
