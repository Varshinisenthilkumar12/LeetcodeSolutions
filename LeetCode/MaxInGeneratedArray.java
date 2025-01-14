import java.util.ArrayList;
import java.util.Collections;

public class MaxInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if(n==0){
            return 0;
        }
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0);
        al.add(1);
        for(int i=1;i<=n/2;i++){
            if(2*i<=n){
                al.add(al.get(i));
            }
            if(2*i+1<=n){
                al.add(al.get(i)+al.get(i+1));
            }
        }
        return Collections.max(al);
    }
}
