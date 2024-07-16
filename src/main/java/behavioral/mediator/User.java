package behavioral.mediator;

public class User extends Colleague {
    private String name;
    public User(Chat chat, String name) {
        super(chat);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        chat.sendMessage(message, this);
    }
    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }
}
