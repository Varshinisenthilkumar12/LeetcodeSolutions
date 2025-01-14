class KweakestRow {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] a=new int[mat.length];
        int[] b=new int[k];
        int count;
        for(int i=0;i<mat.length;i++){
            count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            a[i]=count;
        }
        int min;
        int min_in;
        for(int j=0;j<k;j++){
            min_in=0;
            min=Integer.MAX_VALUE;
            for(int i=0;i<a.length;i++){
                if(min>a[i]){
                    min=a[i];
                    min_in=i;
                }
            }
            b[j]=min_in;
            a[min_in]=Integer.MAX_VALUE;
        }
        return b;
    }
}