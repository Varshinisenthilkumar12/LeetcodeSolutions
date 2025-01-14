import java.util.List;

public class MinimumRightShifts {
    public int minimumRightShifts(List<Integer> nums) {
        int count=0;
        boolean issorted=true;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)<nums.get(i-1)){
                issorted=false;
                break;
            }
        }
        if(issorted){
            return 0;
        }

        for(int i=0;i<nums.size();i++){
            int temp=nums.get(nums.size()-1);
            for(int j=nums.size()-1;j>0;j--){
                nums.set(j,nums.get(j-1));
            }
            nums.set(0,temp);
            count++;
            
            issorted=true;
            for(int k=0;k<nums.size()-1;k++){
                if(nums.get(k)>nums.get(k+1)){
                    issorted=false;
                    break;
                }
            }
            if(issorted){
                return count;
            }
        }
        return -1;
    }
}
