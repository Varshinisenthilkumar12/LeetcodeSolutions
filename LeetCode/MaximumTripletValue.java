import java.util.ArrayList;
import java.util.Collections;

class MaximumTripletValue {
    public long maximumTripletValue(int[] nums) {
        long a,b;
        ArrayList<Long> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    a=0;
                    a=(long)(nums[i]-nums[j])*nums[k];
                    al.add(a);
                }
            }
        }
        b=Collections.max(al);
        if(b>0){
            return b;
        }else{
            return 0;
        }
    }
}