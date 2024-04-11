
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập số thứ nhất: ");
            try {
                number1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Số của bạn nhập không hợp lệ. Vui lòng nhập số nguyên.");

            }
        }

        while (true){
            System.out.print("Nhập số thứ hai: ");
            try {
                number2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Số của bạn nhập không hợp lệ. Vui lòng nhập số nguyên.");

            }
        }


        int max = Math.max(number1, number2);
        System.out.println("Số lớn nhất là: " + max);
    }
}
