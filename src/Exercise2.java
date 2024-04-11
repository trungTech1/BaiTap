import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number];
        System.out.println("Nhap cac phan tu trong mang");
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        try {
         if (number == 0){
             throw new Exception("loi: mang rong");
         }
         int max = arr[0];
            for (int i = 0; i < number; i++) {
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println("so phan tu lon nhat trong mang " + max);
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
    }
}
