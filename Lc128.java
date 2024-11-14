package lc.lc;

import java.util.HashSet;
import java.util.Hashtable;

public class Lc128 {

    public static void main(String[] args) {
        int i = longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        System.out.println(i);

    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;

        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        int result = 0;
//        Integer[] array = (Integer[]) hashSet.toArray();
        for(Integer current : hashSet){
            int currentResult = 0;
            int left = current;
            int right = current;
            while(true){
                if(hashSet.contains(++left))
                    currentResult++;
                else
                    break;
            }
            while(true){
                if(hashSet.contains(--right))
                    currentResult++;
                else
                    break;
            }
            if(currentResult>result)
                result = currentResult;
        }
        return ++result;
    }


}
