import java.util.Arrays;
import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer arr[] = getArr();
        Arrays.sort(arr);
        System.out.println("Mang da sap xep : " + Arrays.toString(arr));
        System.out.println("So lon nhat : ");
        int max = sc.nextInt();
        System.out.println("So nho nhat : ");
        int min = sc.nextInt();
        int indexMax = binarySearch(arr, max);
        int indexMin = binarySearch(arr, min);
      if(indexMin+1 < arr.length){
        System.out.println("So long hon gan nhaat voi " + min + " la: " + arr[indexMin+1]);
      }
      if (indexMax-1 >= 0 && indexMax-1 >= 0){
        System.out.println("So nho hon gan nhat voi " + max + " la: " + arr[indexMax-1]);
    }
    }
    
    private static Integer[] getArr(){
    Integer arr[] = new Integer[20];
    for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
    }
    Arrays.sort(arr);
    return arr;
    /** Copyright belong to Rekkei Academy*/
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
