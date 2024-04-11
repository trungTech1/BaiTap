import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Mời bạn nhập số:");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number < 2){
                    System.out.println("Số bạn nhập phải lớn hơn hoặc bằng 2.");
                    continue;
                }
                break;
            } catch (Exception e){
                System.out.println("Số bạn nhập không hợp lệ. Vui lòng nhập số nguyên.");
            }
        }
        //kiểm tra số nguyên tố

            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number + " là số nguyên tố.");
            } else {
                System.out.println(number + " không phải là số nguyên tố.");
            }
        }

    }

