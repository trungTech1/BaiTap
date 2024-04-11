import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercse4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao chuoi muon chuyen doi: ");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        list = convertNumberArr(str, list);
        System.out.println("Chuoi sau khi chuyen doi: " + list);

    }
    private static List<Integer> convertNumberArr(String str, List<Integer> list) {
        for (int i = 0; i < str.length(); i++) {
         try {
             int number = Integer.parseInt(String.valueOf(str.charAt(i)));
             list.add(number);
         } catch (NumberFormatException e) {
             list.add(0);
             System.out.println("Ky tu " + str.charAt(i) + " khong phai la so thay the bang 0");
         }
        }
        return list;
    }

}
