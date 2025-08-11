class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(j>i){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
    public void reverse(int[] row){
        int n=0; int r = row.length-1;
        while(r>n){
            int temp = row[n];
            row[n] = row[r];
            row[r] = temp;
            r--;
            n++;
        }
    }
}