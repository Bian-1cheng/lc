package lc.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc15 {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // -4 -1 -1 0 1 2
        List<List<Integer>> result = new ArrayList<>();
        for( int i = 0;i< nums.length;i++){
            for( int j = i+1;j< nums.length;j++){
                if(i>0 && nums[i-1] == nums[i])
                {
                    i++;
                    j++;
                }
                if(j== nums.length)
                    break;
                int target = -nums[i] - nums[j];
                int k = nums.length-1;
                while(k>j){
                    if(target > nums[k])
                        break;
                    if(isaBoolean(nums, i, j, k)){
                        ArrayList<Integer> item = new ArrayList<>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[k]);
                        System.out.println(i +" "+ j +" "+ k);
                        result.add(item);
                        break;
                    }
                    k--;
                }
//                    extracted(nums, i, j, k, result);

            }
        }
        return result;

    }

    private static void extracted(int[] nums, int i, int j, int k, List<List<Integer>> result) {
        if(isaBoolean(nums, i, j, k)){
            ArrayList<Integer> item = new ArrayList<>();
            item.add(nums[i]);
            item.add(nums[j]);
            item.add(nums[k]);
            System.out.println(i +" "+ j +" "+ k);
            result.add(item);
        }
    }

    private static boolean isaBoolean(int[] nums, int i, int j, int k) {
        return nums[i] + nums[j] + nums[k] == 0;
    }
}
