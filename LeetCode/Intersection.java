import java.util.ArrayList;

public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2){
        }else{
        }
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]!=Integer.MAX_VALUE && nums1[i]==nums2[j]){
                    res.add(nums2[j]);
                    nums2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        int[] res1=new int[res.size()];
        for(int i=0;i<res.size();i++){
            res1[i]=res.get(i);
        }
        return res1;
    }
} 
    

