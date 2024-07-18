package behavioral.state.mystate;

// ConcreteState B
class ModerationState implements State {
    @Override
    public void publish(DocumentContext context) {
        System.out.println("Document is now published.");
        context.setState(new PublishedState());
    }

    @Override
    public void reject(DocumentContext context) {
        System.out.println("Document is now rejected.");
        context.setState(new DraftState());
    }
}
