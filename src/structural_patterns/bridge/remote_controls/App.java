package structural_patterns.bridge.remote_controls;

public class App {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remoteTv = new BasicRemoteControl(tv); // controle remoto para tv

        remoteTv.togglePower(); // liga a tv
        remoteTv.togglePower(); // desliga a tv

        Device radio = new Radio();
        RemoteControl remoteRadio = new BasicRemoteControl(radio); // controle remoto para radio

        remoteRadio.togglePower(); // liga o radio
        remoteRadio.togglePower(); // desliga o radio
    }
}
