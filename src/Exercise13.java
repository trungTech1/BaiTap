import java.util.Arrays;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi ban dau: ");
        String str = scanner.nextLine();
        try {
            if (str.isEmpty()) {
                throw new Exception("Chuoi rong khong the dao nguoc");
            } else {
                StringBuilder reverseStr = new StringBuilder();
                Arrays.stream(str.split("")).forEach((s) -> reverseStr.insert(0, s));
                System.out.println("Chuoi sau khi dao nguoc: " + reverseStr.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
