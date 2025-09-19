package abstract_factory.car_factory.car;

public class JapanCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling the car with Japan rules");
    }
}
