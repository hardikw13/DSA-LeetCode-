class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int row =mat.length;
        int col = mat[0].length;
        int[] arr = new int[row*col];
        int i =0;
        int  j=0;
        int k=0;

        while(k<row*col){
            while(i>=0 && j<col){
                arr[k] = mat[i][j];
                k++;
            
            i--;
            j++;
            }
            if(j>=col){
                j = col-1;
                i+=2;

        }else{
            i=0;
        }
        while(i<row && j>=0){
            arr[k] = mat[i][j];
            k++;
            i++;
            j--;

}
       if(i>= row){
        i = row-1;
        j+=2;
       }else{
        j=0;
       }

}
    return arr;
    }
}