class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] row_zero = new boolean[row];
        boolean[] col_zero = new boolean[col];
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == 0){
                    row_zero[i] =true;
                    col_zero[j] = true;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                if(row_zero[i] || col_zero[j] == true){
                    matrix[i][j] = 0;
                }
            }
        } 
            
        
        
    }
}