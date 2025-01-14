public class MountainArray {
        public boolean validMountainArray(int[] arr) {
            int n=arr.length;
            int i=1;
                while(n>i && arr[i]>arr[i-1]){ 
                        i++;
                }
                if(i==n || i==1){
                    return false;
                }
                while(n>i && arr[i]<arr[i-1]){ 
                        i++;
                }
                if(i==n){
                    return true;
                }else{
                   return false;
                }
    }
}
