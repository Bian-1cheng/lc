package lc.lc;



public class Lc283 {
    /**
     *  0  1  0  3  12
     * @param args
     */
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};

        moveZeroes(a);
    }
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if(nums[right] != 0){
                if(left != right)
                    swap(left,right,nums);
                left++;
            }
            right ++ ;
        }
    }

    private static void swap(int left,int right,int[] nums){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void moveZeroesV2(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                if(left != right)
                    swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
