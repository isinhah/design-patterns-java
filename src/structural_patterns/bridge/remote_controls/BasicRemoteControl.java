package structural_patterns.bridge.remote_controls;

// Abstração refinada da ponte
public class BasicRemoteControl extends RemoteControl {
    private boolean on = false;

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (on) {
            device.turnOff();
            on = false;
        } else {
            device.turnOn();
            on = true;
        }
    }
}
