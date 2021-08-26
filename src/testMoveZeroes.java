public class testMoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1};
//        //0,0,1
//        int n = nums.length, left = 0, right = 0;
//        while (right < n) {
//            if (nums[right] != 0) {
//                swap(nums, left, right);
//                left++;
//            }
//            right++;
//        }
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int count = nums.length;
        int left = 0, right = 0;
        while (right < count) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

}
