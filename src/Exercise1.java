import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println("nhap so nguyen thu nhat");
                num1 = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap so nguyen thu hai");
                num2 = Integer.parseInt(scanner.nextLine());

                isValidInput = true;

            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Giá trị nhập vào không phải là số nguyên. Vui lòng nhập lại.");

            }
        }
        // Tính tổng và hiển thị kết quả
        int sum = num1 + num2;
        System.out.println("Tổng của " + num1 + " và " + num2 + " là: " + sum);
    }

}
