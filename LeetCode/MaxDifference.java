import java.util.ArrayList;
import java.util.Collections;

public class MaxDifference {
    public int maximumDifference(int[] nums) {
        int sum;
        ArrayList<Integer> s=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=0;
                if(nums[i]<nums[j]){
                    sum=nums[j]-nums[i];
                    s.add(sum);
                }
            }
        }
        if(s.isEmpty()){
            return -1;
        }else{
            return Collections.max(s);
        }
    }
}
