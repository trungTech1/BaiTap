import java.util.Scanner;

public class Exercse6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Ket qua: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Loi: Khong the chia cho 0");
        }
    }
}