abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}

class WindowsDialog extends Dialog {
    public Button createButton() {
        return new WindowsButton();
    }
}

class MacDialog extends Dialog {
    public Button createButton() {
        return new MacButton();
    }
}