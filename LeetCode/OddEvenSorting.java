public class OddEvenSorting {
        public int[] sortEvenOdd(int[] nums) {
            if(nums.length<=2){
                return nums;
            }
            for(int k=0;k<nums.length;k++){
            for(int i=1;i<nums.length-2;i+=2){
                if(nums[i]<nums[i+2]){
                    int temp=nums[i];
                    nums[i]=nums[i+2];
                    nums[i+2]=temp;
                }
            }
            for(int i=0;i<nums.length-2;i+=2){
                if(nums[i]>nums[i+2]){
                    int temp=nums[i];
                    nums[i]=nums[i+2];
                    nums[i+2]=temp;
                }
            }
            }
    
            return nums;
        }
}
