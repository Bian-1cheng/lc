package lc.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/***
 * 哈希表最快
 */
public class lc001 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        int[] nums = {3,2,4};
//        int target = 6;
        int[] indexV2 = twoSum(nums, target);
        for(int item : indexV2){
            System.out.println(item);
        }

    }

    private  static int[] findIndex(int[] nums,int target){
        int result = 0;
        int indexA = 0;
        int indexB = 0;
        for(int i=0;i<nums.length;i++){
            result = target - nums[i];
            indexA = i;
            for(int j=0;j<nums.length;j++){
                if(nums[j] == result){
                    indexB = j;
                    return new int[]{indexA, indexB};
                }
                if(nums[j] > result){
                    break;
                }
            }
        }
//        int[] back = {indexA,indexB};
        return new int[]{indexA, indexB};
    }

    private static int[] twoSum(int[] nums,int target){
        int[] ints = new int[10*10*10*10];
        int indexA = 0;
        int indexB = 0;
        for(int i=0;i< nums.length;i++)
            ints[nums[i]] = 1;

        for(int i=0;i< nums.length;i++){
            int result = target - nums[i];
            indexA = i;
            if(ints[result] == 1){
                indexB = result;
                return new int[]{indexA,indexB};
            }
        }
        return new int[]{indexA,indexB};
    }

}
