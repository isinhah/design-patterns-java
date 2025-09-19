package abstract_factory.car_factory.factory;

import abstract_factory.car_factory.car.Car;
import abstract_factory.car_factory.car.JapanCar;
import abstract_factory.car_factory.document.Document;
import abstract_factory.car_factory.document.JapanDocument;

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
