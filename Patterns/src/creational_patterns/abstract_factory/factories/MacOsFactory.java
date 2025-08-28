package creational_patterns.abstract_factory.factories;

import creational_patterns.abstract_factory.buttons.Button;
import creational_patterns.abstract_factory.buttons.MacOsButton;
import creational_patterns.abstract_factory.checkboxes.Checkbox;
import creational_patterns.abstract_factory.checkboxes.MacOsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
