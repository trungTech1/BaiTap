import java.util.Arrays;
import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer arr[] = getArr();
        System.out.println("Array is: "+ Arrays.toString(arr));
        System.out.println("Max number: ");
        int maxNumber = scanner.nextInt();
        System.out.println("Min number: ");
        int minNumber = scanner.nextInt();
        int maxIndex = binarySearch(arr, maxNumber);
        int minIndex = binarySearch(arr, minNumber);
        if(minIndex+1 < arr.length){
            System.out.println("So lon hon gan nhat voi : " + minNumber + " is: " + arr[minIndex+1]);
        }
        if (maxIndex-1 >= 0 && maxIndex-1 >= 0){
            System.out.println("So nho hon gan nhat voi : " + maxNumber + " is: " + arr[maxIndex-1]);
        }

    }
    private static Integer[] getArr(){
    Integer arr[] = new Integer[20];
    for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
    }
    Arrays.sort(arr);
    return arr;
}
public static int binarySearch(Integer arr[], int number) {
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
