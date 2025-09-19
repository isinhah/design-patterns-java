package abstract_factory.car_factory.service;

import abstract_factory.car_factory.car.Car;
import abstract_factory.car_factory.document.Document;
import abstract_factory.car_factory.factory.CarFactory;

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
