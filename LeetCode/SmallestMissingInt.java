import java.util.Arrays;

public class SmallestMissingInt {
    public int missingInteger(int[] nums) {
        int sum=0;
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                sum+=nums[i];
            }else{
                sum+=nums[i];
                break;
            }
        }
        if(i==nums.length-1){
            sum+=nums[nums.length-1];
        }
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            if(sum==nums[i]){
                sum++;
            }
        }
        return sum;
    }
}
