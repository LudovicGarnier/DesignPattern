package abstract_factory.factories;

import abstract_factory.buttons.Button;
import abstract_factory.buttons.LinuxButton;
import abstract_factory.checkboxes.Checkbox;
import abstract_factory.checkboxes.LinuxCheckbox;

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
