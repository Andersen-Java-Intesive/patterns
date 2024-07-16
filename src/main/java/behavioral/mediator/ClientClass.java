package behavioral.mediator;

public class ClientClass {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User vladimir = new User(chatRoom, "Vladimir");
        User nikolai = new User(chatRoom, "Nikolai");
        User marina = new User(chatRoom, "Marina");
        chatRoom.addUser(vladimir);
        chatRoom.addUser(nikolai);
        chatRoom.addUser(marina);
        vladimir.send("Hello!");
        nikolai.send("Hi, vlad!");
        marina.send("Good morning!");
    }
}
