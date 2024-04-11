import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;

        try {
            while (true) {
                try {
                    System.out.print("Nhập bán kính hình tròn: ");
                    radius = scanner.nextDouble();

                    if (radius >= 0) {
                        break;
                    } else {
                        System.out.println("Lỗi! Bán kính không thể là một số âm. Vui lòng nhập lại.");
                        scanner.nextLine();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Lỗi! Bạn cần nhập một số.");
                    scanner.nextLine();
                }
            }

            double area = Math.PI * radius * radius;

            System.out.printf("Diện tích hình tròn là: %.2f", area);
        } finally {
            scanner.close();
        }
    }
}
