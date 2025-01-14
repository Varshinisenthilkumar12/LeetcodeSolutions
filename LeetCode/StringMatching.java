import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatching {
    public List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[i].contains(words[j])){
                    res.add(words[j]);
                }
            }
        }
        Set<String> ans=new HashSet<>(res);
        List<String> res1=new ArrayList<>(ans);
        return res1;
    }
}
