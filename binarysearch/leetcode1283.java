import java.util.Arrays;

public class leetcode1283 {
    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{1,2,5,9}, 6));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int ans=0;
        while(start<end){
            int sum=0;
            int mid=start+(end-start)/2;
            for(int i=0;i<nums.length;i++){
                nums[i]=nums[i]/nums[mid];
                sum+=nums[i];
            }
            if(sum<=threshold){
                ans=mid;
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
