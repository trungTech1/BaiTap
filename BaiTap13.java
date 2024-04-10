import java.util.Arrays;
import java.util.Scanner;

public class BaiTap13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = getArr();
        System.out.println("Mang dau vao: " + Arrays.toString(arr));
        while(true) {
            System.out.println("Chọn thuật toán sắp xếp: ");
            System.out.println("1. Sap xep sui bot");
            System.out.println("2. Sap xep chon");
            System.out.println("3. Sap xep chen");
            System.out.println("4. Thoat");
            System.out.println("Chon: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bubbleSort(arr);
                    System.out.println("Mang sau khi sap xep sui bot: " + Arrays.toString(arr));
                    break;
                case 2:
                    selectionSort(arr);
                    System.out.println("Mang sau khi sap xep chon: " + Arrays.toString(arr));
                    break;
                case 3:
                    insertionSort(arr);
                    System.out.println("Mang sau khi sap xep chen: " + Arrays.toString(arr));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }

    }

    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // Sap xep sui bot
    public static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Sap xep chon
    public static void selectionSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Sap xep chen
    public static void insertionSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
