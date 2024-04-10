import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        int arr[][] = getArr();
       printArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        boolean check = searchNumber(arr, number);
        if (!check) {
            System.out.println("Number not found!");
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
    public static boolean searchNumber(int[][] arr,int number){
        List<Integer> rowPositions = new ArrayList<>();
        List<Integer> colPositions = new ArrayList<>();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (number == arr[i][j]) {
                    rowPositions.add(i);
                    colPositions.add(j);
                    check = true;
                }
            }
        }
        for (int i = 0; i < rowPositions.size(); i++) {
            System.out.println("Position: ["+rowPositions.get(i)+"]["+colPositions.get(i)+"]");
        }
        return check;
    }
      public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
