public class OddValueCells {
        public int oddCells(int m, int n, int[][] indices) {
            int[][] mat=new int[m][n];
            int count=0;
            int d=0;
            for(int i=0;i<indices.length;i++){
                for(int j=0;j<indices[i].length;j++){
                    int k=indices[i][j];
                    if(d%2==0){
                        for(int l=0;l<n;l++){
                            mat[k][l]=mat[k][l]+1;
                        }
                        d++;
                    }else{
                        for(int l=0;l<m;l++){
                            mat[l][k]=mat[l][k]+1;
                        }
                        d++;
                    }
                }
            }
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    if(mat[i][j]%2!=0){
                        count++;
                    }
                }
            }
            return count;
        }
}
