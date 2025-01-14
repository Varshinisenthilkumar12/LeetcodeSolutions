class DominantIndex {
    public int dominantIndex(int[] nums) {
        
        int max=nums[0];
        int max_in=0;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                max_in=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=max_in && nums[i]*2 > max){
                return -1;
            }
        }
       return max_in;
    }
}