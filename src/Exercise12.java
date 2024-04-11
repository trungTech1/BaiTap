
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số thứ nhất: ");
            int num1 = scanner.nextInt();

            System.out.print("Nhập số thứ hai: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("Lỗi! Cả hai số đều bằng 0.");
                return;
            }

            int ucln = findGreatestCommonDivisor(num1, num2);

            System.out.println("Ước chung lớn nhất của hai số là: " + ucln);

        } catch (Exception e) {
            System.out.println("Lỗi! Bạn cần phải nhập số nguyên.");
        } finally {
            scanner.close();
        }
    }

    public static int findGreatestCommonDivisor(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
