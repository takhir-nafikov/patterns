package abstract_factory.java.factories;

import abstract_factory.java.buttons.Button;
import abstract_factory.java.buttons.WindowsButton;
import abstract_factory.java.checkboxes.Checkbox;
import abstract_factory.java.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
