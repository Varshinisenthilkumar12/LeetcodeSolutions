import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int count=0;
        int n=nums.length;
        Arrays.sort(nums);
        int[] ar=new int[2];
        for(int i=1;i<n+1;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    count++;
                }
            }
            if(count==2){
                ar[0]=i;
            }else if(count==0){
                ar[1]=i;
            }
        }
        return ar;
    }
}
