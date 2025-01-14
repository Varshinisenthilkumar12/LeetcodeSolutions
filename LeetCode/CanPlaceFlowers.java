class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int t=0;
            for(int i=0;i<flowerbed.length;i++){
                if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    t++;
                }
                if(t==n || n==0){
                    return true;
                }
            }
        return false;
    }
}