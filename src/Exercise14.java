import java.util.ArrayList;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int len = Integer.parseInt(scanner.nextLine());
        if(len <= 0) {
            throw new Exception("Do dai cua mang phai lon hon 0");
        }
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        double res=0;
        for (int i = 0; i < len; i++) {
            res += numbers[i];
        }
        System.out.println("Trung binh cong cua mang la: " + res/len);
        } catch (Exception e) {
            if (e instanceof NumberFormatException) {
                System.out.println("Nhap vao phai la so nguyen");
            } else {
                System.out.println(e.getMessage());
            }
        }
    }
}
