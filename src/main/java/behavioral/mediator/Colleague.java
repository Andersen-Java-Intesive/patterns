package behavioral.mediator;

abstract class Colleague {
    protected Chat chat;
    public Colleague(Chat chat) {
        this.chat = chat;
    }
}
