public class CheckEveryRowCol {
        public boolean checkValid(int[][] matrix) {
            
            int n=matrix.length;
            for(int i=0;i<n;i++){
                int[] m=new int[101];
                for(int j=0;j<n;j++){
                    int k=matrix[i][j];
                    if(m[k]<0){
                        return false;
                    }else{
                        m[k]=-1;
                    }
                }
            }
            for(int i=0;i<n;i++){
            int[] m=new int[101];
            for(int j=0;j<n;j++){
                int k=matrix[j][i];
                    if(m[k]<0){
                        return false;
                    }else{
                        m[k]=-1;
                    }
                }
            }
            return true;
        }
}
