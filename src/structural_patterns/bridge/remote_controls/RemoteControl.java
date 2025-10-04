package structural_patterns.bridge.remote_controls;

// 2 - Abstração: Controle remoto é a ponte (bridge)
public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
}
