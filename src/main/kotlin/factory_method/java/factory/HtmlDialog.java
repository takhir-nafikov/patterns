package factory_method.java.factory;

import factory_method.java.buttons.Button;
import factory_method.java.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
