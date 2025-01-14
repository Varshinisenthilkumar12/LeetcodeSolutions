public class GoodTriplets {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int k=j+1;k<arr.length;k++){
                        int a1=Math.abs(arr[i]-arr[j]);
                        int b1=Math.abs(arr[j]-arr[k]);
                        int c1=Math.abs(arr[i]-arr[k]);
                        
                        if(a1<=a && b1<=b && c1<=c){
                            count++;
                        }
                    }
                }
            }
            return count;
        }
}
