import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap canh a: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhap canh b: ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhap canh c: ");
            double c = Double.parseDouble(scanner.nextLine());
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException();
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException();
            }
            System.out.println("Tam giac hop le!");
        } catch (Exception e) {
            if(e instanceof NumberFormatException)
                System.out.println("Loi: " + e.getMessage() + " khong phai la so");
            else {System.out.println(e.getMessage());}

        }
    }
}
