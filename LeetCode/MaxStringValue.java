import java.util.ArrayList;
import java.util.Collections;

public class MaxStringValue {
    public int maximumValue(String[] strs) {
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            String s1=strs[i];
            if(s1.matches("\\d+")){
                int k=Integer.parseInt(s1);
                al.add(k);
            }else{
                al.add(s1.length());
            }
        }
        return Collections.max(al);
    }
}
