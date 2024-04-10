import java.util.Arrays;
import java.util.Scanner;

public class BaiTap12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Bước 1: Tạo mảng số nguyên và gán giá trị
        Integer[] arr = getArr();
        
        // Bước 2: In ra mảng số nguyên đó
        System.out.println("Mảng đầu vào: " + Arrays.toString(arr));
        
        // Bước 3: Nhập vào số nguyên từ bàn phím
        System.out.println("Nhập số cần tìm: ");
        int number = scanner.nextInt();
        
        // Bước 4: Tìm kiếm nhị phân để tìm ra số nhập vào
        int index = binarySearch(arr, number);
        if (index != -1) {
            // Bước 5: In vị trí của số đó ra
            System.out.println("Số " + number + " ở vị trí " + index);
        } else {
            System.out.println("Không tìm thấy số " + number);
        }
    }
    
    // Hàm tạo mảng số nguyên và gán giá trị
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    
    // Hàm thực hiện tìm kiếm nhị phân
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
