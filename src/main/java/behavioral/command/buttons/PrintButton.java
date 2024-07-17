package behavioral.command.buttons;

import behavioral.command.commands.PrintCommand;

public class PrintButton extends Button {

    public PrintButton() {
        super(new PrintCommand());
    }

}
