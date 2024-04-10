import java.util.Scanner;

class BaiTap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String longestSortedSubstring = findLongestSortedSubstring(input);
        System.out.println("The longest sorted substring is: " + longestSortedSubstring);
    }

    static String findLongestSortedSubstring(String str) {
        int maxLength = 0;
        int endIndex = -1;
        int currentLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) >= str.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i - 1;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            endIndex = str.length() - 1;
        }

        return str.substring(endIndex - maxLength + 1, endIndex + 1);
    }
}