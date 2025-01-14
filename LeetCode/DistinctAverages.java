import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class DistinctAverages {
    public int distinctAverages(int[] nums) {
       ArrayList<Float> al=new ArrayList<>(); 
       ArrayList<Integer> bl=new ArrayList<>(); 
       for(int i=0;i<nums.length;i++){
            bl.add(nums[i]);
       }
       while(bl.size()>0){
        int max=Collections.max(bl);
        int min=Collections.min(bl);
        float avg=(max+min)/2.0f;
        al.add(avg);
        bl.remove(Integer.valueOf(max));
        bl.remove(Integer.valueOf(min));
       }
       Set<Float> ne=new HashSet<>(al);
       ArrayList<Float> cl=new ArrayList<>(ne);
       int p=cl.size();
       return p;
    }
}