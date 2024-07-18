package behavioral.memento.mymemento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        editor.setText("Hello, world!");
        caretaker.save(editor);

        System.out.println("Current Text: " + editor.getText());

        editor.setText("Hello, design patterns!");
        caretaker.save(editor);

        System.out.println("Current Text: " + editor.getText());

        editor.setText("Hello, Memento!");
        System.out.println("Current Text: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getText());
    }
}
