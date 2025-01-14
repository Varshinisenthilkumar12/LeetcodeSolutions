import java.util.HashSet;
import java.util.Set;

public class MinCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> al=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            al.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(al.contains(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
    }
}
