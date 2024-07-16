package creational.factory_method;

import creational.factory_method.factory.Dialog;
import creational.factory_method.factory.HtmlDialog;
import creational.factory_method.factory.WindowsDialog;

public class Client {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").contains("Windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
