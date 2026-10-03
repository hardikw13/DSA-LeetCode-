class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] copy = new int[m][n];

        // Copy original board
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                copy[i][j] = board[i][j];
            }
        }

        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};

        // Visit every cell
        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                int count = 0;

                // Check 8 neighbours
                for(int k = 0; k < 8; k++) {

                    int nr = i + dr[k];
                    int nc = j + dc[k];

                    if(nr >= 0 && nr < m &&
                       nc >= 0 && nc < n &&
                       copy[nr][nc] == 1) {

                        count++;
                    }
                }

                // Apply rules AFTER counting all neighbours
                if(copy[i][j] == 1) {

                    // Alive cell
                    if(count < 2 || count > 3) {
                        board[i][j] = 0;
                    }

                } else {

                    // Dead cell
                    if(count == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}