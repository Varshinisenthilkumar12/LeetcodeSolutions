import java.util.ArrayList;
import java.util.Collections;

public class MaxPalindroms {
    public int maxPalindromesAfterOperations(String[] words) {
        ArrayList<Integer> c=new ArrayList<>();
        int[] freq =new int[26];

        for(int i=0;i<words.length;i++){
            String w=words[i];
            for(int j=0;j<w.length();j++){
                char ch=w.charAt(j);
                freq[ch-'a']++;
            }
            c.add(w.length());
        }

        int temp=0;
        for(int i=0;i<freq.length;i++){
            temp+=freq[i]/2;
        }

        Collections.sort(c);

        int res=0;
        for(int i=0;i<c.size();i++){
            int l=c.get(i)/2;
            if(l<=temp){
                res++;
                temp-=l;
            }
        }
        return res;
    } 
}
