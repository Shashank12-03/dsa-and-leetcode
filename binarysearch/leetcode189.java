// package binarysearch;

import java.util.Arrays;

public class leetcode189 {
    public static void main(String[] args) {
        rotate(new int[]{1,2}, 3);
    }
    static void rotate(int[] nums, int k) {
        // Arrays.sort(nums);
        // reverse(nums);
        // Arrays.sort(nums, 0, k);
        // Arrays.sort(nums, k, nums.length);
        // System.out.println(Arrays.toString(nums));
        int[] temp=new int[nums.length];
        temp=nums.clone();
        int j=0;
        if((nums.length-k)>0){
            for(int i=nums.length-k;i<nums.length;i++){
                nums[j++]=temp[i];
            }
            for(int i=0;i<nums.length-k;i++){
                nums[j++]=temp[i];
            }
        }
        else{
            reverse(nums);
        }
        System.out.println(Arrays.toString(nums));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
