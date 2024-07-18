package behavioral.memento.mymemento;

import java.util.Stack;

class TextEditorCaretaker {
    private Stack<TextMemento> mementoStack = new Stack<>();

    public void save(TextEditor editor) {
        mementoStack.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!mementoStack.isEmpty()) {
            editor.restore(mementoStack.pop());
        }
    }
}
