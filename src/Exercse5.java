import java.util.Arrays;
import java.util.Scanner;

public class Exercse5 {
    public static void main(String[] args) {
        int[] chaoticArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap so muon tim kiem: ");
        int number = scanner.nextInt();
        Arrays.sort(chaoticArr);
        int index = Arrays.binarySearch(chaoticArr, number);
        try {
            if (index < 0) {
                throw new Exception("Khong tim thay so " + number + " trong mang");
            }
            System.out.println("Tim thay so " + number + " tai vi tri " + index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
