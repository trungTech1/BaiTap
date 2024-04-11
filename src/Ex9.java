import java.util.Scanner;

public class Ex9 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0, fib2 = 1, fib = 1; // Sửa lỗi: thiếu dấu phẩy ở dòng này
        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương n: ");
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    System.out.println("Số bạn nhập không hợp lệ. Vui lòng nhập số nguyên dương.");
                } else {
                    break; // Thoát khỏi vòng lặp nếu nhập đúng
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Số bạn nhập không hợp lệ. Vui lòng nhập số nguyên dương.");
                scanner.nextLine(); // Xóa bộ nhớ đệm của Scanner để tránh lặp vô hạn
            }
        }
        System.out.println("Số Fibonacci thứ " + n + " là: " + fibonacci(n)); // Đã đặt dấu đóng ngoặc cho phương thức fibonacci
        scanner.close();
    }
}
