import java.util.Scanner;

public class BaiTap2 {
    /**
     * InnerBaiTap2
     */
    public static void main(String[] agrs){
        int arr[][] = getArr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = sc.nextLine();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (number.equals(String.valueOf(arr[i][j]))) {
                    count++;
                }
            }
        }
    }
    public static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        return arr;
    }
}
