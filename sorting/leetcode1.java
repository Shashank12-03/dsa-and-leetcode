//worst solution
package sorting;
import java.util.Arrays;
public class leetcode1 {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString(twoSum(nums, -8)));
    }
    static int[] twoSum(int[] nums, int target) {
        int[] temp=nums.clone();
        Arrays.sort(nums);
        int[] ans=new int[2];
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                int a=0;
                int b=0;
                for(int k=0;k<nums.length;k++){
                    if(temp[k]==nums[left]){
                        a=k;
                        break;
                    }
                }
                for(int k=0;k<nums.length;k++){
                    if(k!=a && temp[k]==nums[right]){
                        b=k;
                    }
                }
                return new int[]{a,b};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}
