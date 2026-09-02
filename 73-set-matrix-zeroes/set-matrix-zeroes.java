class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] row_zero = new boolean[row];
        boolean[] col_zero =new boolean[col];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    row_zero[i] = true;
                    col_zero[j] = true;
                
                }
            }
        }
                    for(int u=0;u<matrix.length;u++){
                        for(int v =0;v<matrix[u].length;v++){
                            if(row_zero[u] || col_zero[v]){
                                matrix[u][v] = 0;
                            }
                        }
                    }
                
            
        
        
    }
}