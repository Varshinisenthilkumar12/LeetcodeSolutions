class ArrayDivisionWithMinimumCostI {
    public int minimumCost(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int tot_co=nums[0]+nums[i]+nums[j];
                min=Math.min(tot_co,min);
            }
        }
        return min;
    }
}