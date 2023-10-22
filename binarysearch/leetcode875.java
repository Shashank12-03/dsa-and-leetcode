// package binarysearch;

public class leetcode875 {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{312884470}, 312884469));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=max(piles);
        while(start<=end){
            int mid=(start+end)/2;
            int hrtaken=calhr(piles,mid);
            //if hour taken is less than req check for more min 
            if(hrtaken<=h){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    private static int max(int[] piles) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
    public static int calhr(int[] piles, int hourly) {
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+=Math.ceil((double)piles[i]/(double)hourly);
        }
        return total;
    }
}
