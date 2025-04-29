public class MainLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Khởi động ứng dụng.");
        logger.log("Người dùng đăng nhập.");
        logger.log("Người dùng thực hiện giao dịch.");

        System.out.println("Tổng số log đã ghi: " + logger.getLogCount());

        // Kiểm tra instance
        Logger logger2 = Logger.getInstance();
        logger2.log("Đây là log từ logger thứ hai (vẫn là cùng instance).");
        System.out.println("Số log hiện tại: " + logger2.getLogCount());
    }
}
