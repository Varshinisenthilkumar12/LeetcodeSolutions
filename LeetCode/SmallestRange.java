public class SmallestRange {
        public int smallestRangeI(int[] nums, int k) {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                min=Math.min(min,nums[i]);
                max=Math.max(max,nums[i]);
            }
            int res=max-min-2*k;
            return Math.max(res,0);
        }
}
