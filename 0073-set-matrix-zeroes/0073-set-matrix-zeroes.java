class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<Integer>();
        HashSet<Integer> col = new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int r: row){
            for(int i=0;i<matrix[r].length;i++){
                matrix[r][i] = 0;
            }
        }
        for(int c: col){
            for(int i=0;i<matrix.length;i++){
                matrix[i][c] = 0;
            }
        }
    }
}