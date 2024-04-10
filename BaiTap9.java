import java.util.Arrays;
import java.util.Scanner;

public class BaiTap9 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Enter the value to search:");
        int value = scanner.nextInt();
        int result = binarySearch(array, 0, size - 1, value);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = left + (right - left) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (array[middle] > value) {
                return binarySearch(array, left, middle - 1, value);
            }
            return binarySearch(array, middle + 1, right, value);
        }
        return -1;
    }
}
