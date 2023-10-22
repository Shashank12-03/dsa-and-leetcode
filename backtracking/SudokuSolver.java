package backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][]board={
                        {7,8,0,4,0,0,1,2,0},
                        {6,0,0,0,7,5,0,0,9},
                        {0,0,0,6,0,1,0,7,8},
                        {0,0,7,0,4,0,2,6,0},
                        {0,0,1,0,5,0,9,3,0},
                        {9,0,4,0,6,0,0,0,5},
                        {0,7,0,3,0,0,0,1,2},
                        {1,2,0,0,0,7,4,0,0},
                        {0,4,9,2,0,6,0,0,7}
                    };
        solve(board);
        display(board);
    }
    static boolean solve(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyleft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyleft=false;
                    break;
                }
            }
            if(!emptyleft){
                break;
            }
        }
        if(emptyleft){
            return true;
        }
        for(int number=1;number<=9;number++){
            if(issafe(board, row, col, number)){
                board[row][col]=number;
                if(solve(board)){
                    return true;
                }
                else{
                    board[row][col]=0;
                }
            }
        }
        return false;
    }
    static void display(int[][]board){
        for(int[] row:board){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    static boolean issafe(int[][] board, int row,int col,int num){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        for(int[] nums:board){
            if(nums[col]==num){
                return false;
            }   
        }
        int sqrt=(int) Math.sqrt(board.length);
        int rowstart=row- row%sqrt;
        int colstart=col- col%sqrt;
        for(int i=rowstart;i<rowstart+sqrt;i++){
            for(int j=colstart;j<colstart+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
