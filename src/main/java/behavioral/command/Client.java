package behavioral.command;


import behavioral.command.buttons.Button;
import behavioral.command.buttons.CloseButton;
import behavioral.command.buttons.OpenButton;
import behavioral.command.buttons.PrintButton;
import behavioral.command.buttons.SaveButton;

public class Client {

    private static Button openButton;
    private static Button printButton;
    private static Button saveButton;
    private static Button closeButton;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        openButton = new OpenButton();
        printButton = new PrintButton();
        saveButton = new SaveButton();
        closeButton = new CloseButton();
    }

    static void runBusinessLogic() {
        openButton.pressButton();
        printButton.pressButton();
        printButton.pressButton();
        saveButton.pressButton();
        closeButton.pressButton();
    }

}
