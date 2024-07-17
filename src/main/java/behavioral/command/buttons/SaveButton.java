package behavioral.command.buttons;

import behavioral.command.commands.SaveCommand;

public class SaveButton extends Button {

    public SaveButton() {
        super(new SaveCommand());
    }

}
