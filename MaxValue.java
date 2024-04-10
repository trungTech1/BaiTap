import java.util.Arrays;

/**
 * MaxValue
 */
public class MaxValue {

    public static void main(String[] args) {
        int arr[] = getArr();
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Array is: "+ Arrays.toString(arr));
        System.out.println("Max value is: " + max);
    }

    public static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
}