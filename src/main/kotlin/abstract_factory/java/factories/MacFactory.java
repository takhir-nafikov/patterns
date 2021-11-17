package abstract_factory.java.factories;

import abstract_factory.java.buttons.Button;
import abstract_factory.java.buttons.MacButton;
import abstract_factory.java.checkboxes.Checkbox;
import abstract_factory.java.checkboxes.MacCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
