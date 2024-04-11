
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập ngày: ");
            int day = scanner.nextInt();

            System.out.print("Nhập tháng: ");
            int month = scanner.nextInt();

            System.out.print("Nhập năm: ");
            int year = scanner.nextInt();

            if (isValidDate(day, month, year)) {
                System.out.println("Ngày tháng năm hợp lệ.");
            } else {
                System.out.println("Lỗi! Ngày tháng năm không hợp lệ.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi! Bạn cần phải nhập số nguyên.");
        } finally {
            scanner.close();
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (year <= 0) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        int maxDayOfMonth = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDayOfMonth = 30;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDayOfMonth = 29;
            } else {
                maxDayOfMonth = 28;
            }
        }

        if (day < 1 || day > maxDayOfMonth) {
            return false;
        }

        return true;
    }
}
