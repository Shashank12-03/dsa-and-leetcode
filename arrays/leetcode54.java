package arrays;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    public static void main(String[] args) {
        
    }
    List<Integer> ans= new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix){
        helper(matrix,0,0,matrix.length-1,matrix[0].length-1);
        return ans;
    }
    private void helper(int[][] matrix, int row,int col, int k,int l) {
        while (col<matrix[0].length) {
            ans.add(matrix[row][col]);
            col++;
        }
        while(row<matrix.length){
            ans.add(matrix[row][col]);
            row++;
        }
        while (l>0) {
            ans.add(matrix[row][l]);
        }
        while (k>0) {
            ans.add(matrix[k][col]);
        }
    }
}
