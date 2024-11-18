package lc.lc;

public class Lc11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int result = 0;
        while(left < right){
            int minHeight = Math.min(height[left],height[right]);

            int current = minHeight * (right - left);
            if(current > result)
                result = current;
            if(height[left] >= height[right]){
                right--;
            }else{
                left++;
            }
        }
        return result;
    }
}
