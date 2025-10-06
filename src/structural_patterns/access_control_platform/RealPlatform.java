package structural_patterns.access_control_platform;

public class RealPlatform implements Platform {

    @Override
    public void access() {
        System.out.println("Accessing the company's platform");
    }
}
