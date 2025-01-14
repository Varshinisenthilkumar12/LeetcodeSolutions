import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbs {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min_abs=Integer.MAX_VALUE;
        List<List<Integer>> res=new ArrayList<>();
        
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])<min_abs){
                min_abs=Math.abs(arr[i]-arr[i-1]);
            }
        }

        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])==min_abs){
                List<Integer> ans=new ArrayList<>();
                ans.add(arr[i-1]);
                ans.add(arr[i]);
                res.add(ans);  
            }  
        }
        return res;
    }
}
