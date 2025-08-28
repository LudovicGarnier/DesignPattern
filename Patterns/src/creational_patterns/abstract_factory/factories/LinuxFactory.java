package creational_patterns.abstract_factory.factories;

import creational_patterns.abstract_factory.buttons.Button;
import creational_patterns.abstract_factory.buttons.LinuxButton;
import creational_patterns.abstract_factory.checkboxes.Checkbox;
import creational_patterns.abstract_factory.checkboxes.LinuxCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
