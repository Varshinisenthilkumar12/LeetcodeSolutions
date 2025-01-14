public class MaxPopYear {
        public int maximumPopulation(int[][] logs) {
            int[] d=new int[101];
            for(int i=0;i<logs.length;i++){
                d[logs[i][0]-1950]++;
                d[logs[i][1]-1950]--;
            }   
            int p=0,maxc=0,m=0;
            for(int i=0;i<d.length;i++){
                p+=d[i];
                if(maxc<p){
                    maxc=p;
                    m=i;
                }
            }
            return m+1950;
        }

}
