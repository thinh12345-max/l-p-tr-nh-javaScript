public class MainFactory {
    public static void main(String[] args) {
        Dialog dialog;

        dialog = new WindowsDialog();
        dialog.renderWindow();

        dialog = new MacDialog();
        dialog.renderWindow();
    }
}