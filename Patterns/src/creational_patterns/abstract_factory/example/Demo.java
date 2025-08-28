package creational_patterns.abstract_factory.example;

import creational_patterns.abstract_factory.app.Application;
import creational_patterns.abstract_factory.factories.GUIFactory;
import creational_patterns.abstract_factory.factories.LinuxFactory;
import creational_patterns.abstract_factory.factories.MacOsFactory;
import creational_patterns.abstract_factory.factories.WindowsFactory;

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
