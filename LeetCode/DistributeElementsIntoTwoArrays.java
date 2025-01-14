public class DistributeElementsIntoTwoArrays {
        public int[] resultArray(int[] nums) {
            int n=nums.length;
            if(n<=2){
                return nums;
            }
            int[] a1=new int[n];
            int[] a2=new int[n];
            int[] ans=new int[n];
    
            int s1=0;
            int s2=0;
    
            a1[s1++]=nums[0];
            a2[s2++]=nums[1];
    
            for(int i=2;i<n;i++){
                if(a1[s1]>a2[s2-1]){
                    a1[s1++]=nums[i];
                }else{
                    a2[s2++]=nums[i];
                }
            }
            int index=0;
            for(int i=0;i<s1;i++){
                ans[index++]=a1[i];
            }
            for(int i=0;i<s2;i++){
                ans[index++]=a2[i];
            }
            return ans;
        }
}
