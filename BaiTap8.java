import java.util.Scanner;

public class BaiTap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String result = findLongestIncreasingSubstring(input);
        System.out.println("The longest increasing substring is: " + result);
    }

    public static String findLongestIncreasingSubstring(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        String longestSubstring = "" + input.charAt(0);
        String currentSubstring = "" + input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) >= currentSubstring.charAt(currentSubstring.length() - 1)) {
                currentSubstring += input.charAt(i);
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                }
            } else {
                currentSubstring = "" + input.charAt(i);
            }
        }
        return longestSubstring;
    }
}
