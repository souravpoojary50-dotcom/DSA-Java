public class L3 {

    public static void main(String args[]) {
        int[] input = { 1, 1, 2, 2, 3, 4, 4, 4 };

        int k = new L3().removeDuplicates(input);
        System.out.println(k);
        for (int i = 1; i <= k; i++) {
            System.out.println(i + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        // System.out.println(nums[i]+" ");
        return i + 1;
    }
}
