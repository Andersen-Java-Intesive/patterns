package behavioral.command.buttons;

import behavioral.command.commands.Command;

public abstract class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
