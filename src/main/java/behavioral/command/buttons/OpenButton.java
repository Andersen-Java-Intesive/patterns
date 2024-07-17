package behavioral.command.buttons;

import behavioral.command.commands.OpenCommand;

public class OpenButton extends Button {

    public OpenButton() {
        super(new OpenCommand());
    }

}
