public class MatrixModification {
        public int[][] modifiedMatrix(int[][] matrix) {
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j]==-1){
                        for(int k=0;k<matrix.length;k++){
                            matrix[i][j]=Math.max(matrix[k][j],matrix[i][j]);
                        }
                    }
                }
            }
            return matrix;
        }
}
