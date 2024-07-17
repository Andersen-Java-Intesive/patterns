package behavioral.command.commands;

public class OpenCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Open file");
    }

}
