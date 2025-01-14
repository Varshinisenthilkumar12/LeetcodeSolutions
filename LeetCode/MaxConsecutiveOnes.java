import java.util.ArrayList;
import java.util.Collections;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        int n=1;
        int j=1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                
                if(nums[i]==1){
                    sum++;
                }
            }
            return sum;
        }
        if(nums.length==3){
        for(int i=0;i<nums.length;i++){
            int o=0;
            if(j<=nums.length-1){
                if(nums[i]==1){
                o++;
            }
        }
        return o;          
        }
    }
        if(nums.length>3){
        for(int i=0;i<nums.length;i++){
            if(j<=nums.length-1){
                if(nums[i]==1 && nums[j]==1){
                n++;
                al.add(n);
            }else{
                n=1;
            }
            j++;
            }
            
        }
        }

        if(al.size()==0){
            return 0;
        }

        return Collections.max(al);
    }
}
