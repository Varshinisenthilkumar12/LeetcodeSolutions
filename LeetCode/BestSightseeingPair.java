import java.util.ArrayList;

public class BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        @SuppressWarnings("unused")
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        int prev=values[0];
        for(int i=1;i<values.length;i++){
            sum=Math.max(sum,prev+values[i]-i);
            prev=Math.max(prev,values[i]+i);
        }
        return sum;
    }
}

