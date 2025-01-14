public class SemiOrderPermutation {
        public int semiOrderedPermutation(int[] nums) {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int minTemp=0;
            int maxTemp=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    min=nums[i];
                    minTemp=i;
                }
                if(nums[i]>max){
                    max=nums[i];
                    maxTemp=i;
                }
            }
            int count=0;
            if(minTemp<maxTemp){
                count=Math.abs(0-minTemp)+Math.abs(nums.length-1-maxTemp);
            }else{
                count=Math.abs(0-minTemp)+Math.abs((nums.length-1)-maxTemp-1);
            }
            
            /*if(min==nums[0] && max==nums[nums.length-1]){
                return 0;
            }
            int count=0;
            
            while(minTemp!=0){
                    int tempMin=nums[minTemp];
                    nums[minTemp]=nums[minTemp-1];
                    nums[minTemp-1]=tempMin;
                    minTemp--;
                    count++;
            }
            
            while(maxTemp!=nums.length-1){
                    int tempMAX=nums[maxTemp];
                    nums[maxTemp]=nums[maxTemp+1];
                    nums[maxTemp+1]=tempMAX;
                    maxTemp++;
                    count++;
            }
            if(minTemp>maxTemp){
                count--;
            }*/
            return count;
    
        }
}
