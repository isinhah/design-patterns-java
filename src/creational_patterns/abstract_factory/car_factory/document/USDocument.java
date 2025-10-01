package creational_patterns.abstract_factory.car_factory.document;

public class USDocument implements Document {
    @Override
    public void issue() {
        System.out.println("Issuing the US document");
    }
}
