import java.util.Arrays;

public class L7 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // Pointer for nums1
        int j = n - 1;         // Pointer for nums2
        int k = m + n - 1;     // Pointer for merged array

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }

            // Debug print to see the state after each step
            System.out.println("i=" + i + ", j=" + j + ", k=" + k + " → " + Arrays.toString(nums1));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        L7 L = new L7();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        L.merge(nums1, m, nums2, n);
        System.out.println("Final merged array: " + Arrays.toString(nums1));
    }
}