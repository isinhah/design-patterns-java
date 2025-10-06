package structural_patterns.access_control_platform;

public class Main {
    public static void main(String[] args) {
        Platform platform = new RealPlatform();
        platform.access();
    }
}
