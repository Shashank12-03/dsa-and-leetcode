package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode18 {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        List<List<Integer>> ans= threeSum(arr,0);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> threeSum(int[] arr, int target){
        List<List<Integer>> outer = new ArrayList<>();

        Arrays.sort(arr); // Sort the array in ascending order

        for (int i = 0; i < arr.length - 3; i++) {
            // if (i > 0 && arr[i] == arr[i - 1]) {
            //     continue; // Skip duplicate elements to avoid duplicates in the result
            // }

            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int mid=left+(right-left)/2;
                int sum = arr[i] + arr[left] + arr[right]+arr[mid];
                if (sum == target) {
                    List<Integer> quadrapel = new ArrayList<>();
                    quadrapel.add(arr[i]);
                    quadrapel.add(arr[left]);
                    quadrapel.add(arr[right]);
                    quadrapel.add(arr[mid]);
                    outer.add(quadrapel);

                    // Move the pointers to skip duplicate elements
                    // while (left < right /*&& arr[left] == arr[left + 1]*/) {
                    //     left++;
                    // }
                    // while (left < right /*&& arr[right] == arr[right - 1]*/) {
                    //     right--;
                    // }

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return outer;
    }
}
