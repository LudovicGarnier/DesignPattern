package structural_patterns.bridge;

import structural_patterns.bridge.devices.Device;
import structural_patterns.bridge.devices.Radio;
import structural_patterns.bridge.devices.Tv;
import structural_patterns.bridge.remotes.AdvancedRemote;
import structural_patterns.bridge.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
