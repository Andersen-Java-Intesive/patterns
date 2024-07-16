package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Chat{
    private List<User> users;
    public ChatRoom() {
        this.users = new ArrayList<>();
    }
    public void addUser(User user) {
        users.add(user);
    }
    @Override
    public void sendMessage(String message, Colleague sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}
