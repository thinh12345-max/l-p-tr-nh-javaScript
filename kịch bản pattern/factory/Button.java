interface Button {
    void render();
}

class WindowsButton implements Button {
    public void render() {
        System.out.println("Nút kiểu Windows");
    }
}

class MacButton implements Button {
    public void render() {
        System.out.println("Nút kiểu MacOS");
    }
}