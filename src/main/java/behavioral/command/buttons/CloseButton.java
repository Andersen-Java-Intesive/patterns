package behavioral.command.buttons;

import behavioral.command.commands.CloseCommand;

public class CloseButton extends Button {

    public CloseButton() {
        super(new CloseCommand());
    }

}
