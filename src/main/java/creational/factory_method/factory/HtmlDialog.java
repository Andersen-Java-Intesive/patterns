package creational.factory_method.factory;

import creational.factory_method.button.Button;
import creational.factory_method.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}