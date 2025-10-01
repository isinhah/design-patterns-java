package creational_patterns.abstract_factory.car_factory.document;

public class JapanDocument implements Document {
    @Override
    public void issue() {
        System.out.println("Issuing the Japan document");
    }
}
