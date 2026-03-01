public class L6 {
    static class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]++;
                if (digits[i] < 10) {
                    return digits;
                }
                digits[i] = 0;
            }
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example test cases
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {9, 9, 9};

        // Call plusOne and print results
        printArray(sol.plusOne(digits1)); // Expected output: [1, 2, 4]
        printArray(sol.plusOne(digits2)); // Expected output: [1, 0, 0, 0]
    }

    // Helper method to print arrays
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}