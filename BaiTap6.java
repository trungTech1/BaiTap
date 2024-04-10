import java.util.Arrays;

public class BaiTap6 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2, 7, 1, 9, 6};
        System.out.println("Mang ban dau: "+ Arrays.toString(arr));
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println("Mang sau buoc " + i + ": " + Arrays.toString(arr));
        }
    }
}
