import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindKDistantIndices {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> al =new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                int j=i;
                for(int m=0;m<nums.length;m++){
                    int ab=Math.abs(m-j);
                    if(ab<=k){
                        al.add(m);
                    }
                }
            }
        }
        Set<Integer> nw=new HashSet<>(al);
        List<Integer> bl=new ArrayList<>(nw);
        Collections.sort(bl);
        return bl;
    }    
}
