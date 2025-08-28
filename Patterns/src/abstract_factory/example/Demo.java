package abstract_factory.example;

import abstract_factory.app.Application;
import abstract_factory.factories.GUIFactory;
import abstract_factory.factories.LinuxFactory;
import abstract_factory.factories.MacOsFactory;
import abstract_factory.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name");
        System.out.println("OS Name: " + osName);
        if (osName.toLowerCase().contains("mac")) {
            factory = new MacOsFactory();
        } else if (osName.toLowerCase().contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new LinuxFactory();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
