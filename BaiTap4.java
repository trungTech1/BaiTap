import java.util.Arrays;
import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(String.format("Nhap phan tu thu %d: ", i+1));
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Nhap so can tim : ");
        int number = sc.nextInt();
        int index = binarySearch(arr, number);
        if (index != -1) {
            System.out.println("So " + number + " o vi tri " + index);
        } else {
            System.out.println("khong tim thay so " + number);
        }

    }
   public static int binarySearch(int arr[],int number){
    int low = 0;
    int high = arr.length - 1;
    while (high >= low) {
        int mid = (low + high) / 2;
        if (arr[mid] == number) {
            return mid;
        }
        if (arr[mid] < number) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
   }
}