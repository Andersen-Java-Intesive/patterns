package behavioral.command.commands;

public class SaveCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Save file");
    }

}
