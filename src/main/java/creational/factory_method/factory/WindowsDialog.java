package creational.factory_method.factory;

import creational.factory_method.button.Button;
import creational.factory_method.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}