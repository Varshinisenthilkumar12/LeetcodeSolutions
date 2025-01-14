import java.util.Arrays;

public class GCDOfAnArray {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int res=1;
        for(int i=2;i<=max;i++){
            if(min%i==0 && max%i==0){
                res=i;
            }
        }
        return res;
    }
}
