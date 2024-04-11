public class Exercise3 {
    public static void main(String[] args) {
        String[] numberStrings = {"10", "20", "abc", "30", "40", "xyz", "50"};
        int sum = 0;

        for (String numberString : numberStrings) {
            try {
                int number = Integer.parseInt(numberString);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: \"" + numberString + "\" không phải là số nguyên. Phần tử này sẽ được bỏ qua.");
            }
        }

        System.out.println("Tổng của các số nguyên trong mảng là: " + sum);
    }

}
