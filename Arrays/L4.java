public class L4 {
    public static void main(String args[]) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        int k = new L4().removeElement(nums, val);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
