// package slidingwindow;

// import java.util.ArrayList;
// import java.util.List;

// public class leetcode3 {
//     public static void main(String[] args) {
//         String up="pwwkew";
//         System.out.println(lengthOfLongestSubstring(up));
//     }
//     public static int lengthOfLongestSubstring(String s) {
//         List<Character> store=new ArrayList<>();
//         int l=0;
//         int res-0;
//         for (int i=0;i<s.length();i++){
//             while(s[i]==store.size()){
                
//                 l++;
//             }
//             store.add(s[i]);
//             res=Math.max(res, i-l+1);
//         }
//         return res;
//     }
// }
