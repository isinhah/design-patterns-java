package structural_patterns.access_control_platform;

import java.time.LocalDateTime;

public class PlataformProxy implements Platform {
    private final RealPlatform realPlatform = new RealPlatform();

    @Override
    public void access() {
        int hour = LocalDateTime.now().getHour();
        if (hour >= 7 && hour < 18) {
            realPlatform.access();
        } else {
            System.out.println("Access denied! Available from 7am to 6pm");
        }
    }
}
