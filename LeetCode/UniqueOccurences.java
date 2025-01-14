import java.util.ArrayList;

public class UniqueOccurences {
    public boolean uniqueOccurrences(int[] arr) {
       ArrayList<Integer> al=new ArrayList<>();
        int count;
       for(int i=0;i<arr.length;i++){
            count=1;
            if(arr[i]!=Integer.MAX_VALUE){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=Integer.MAX_VALUE;
                }
            }
            al.add(count);
            }
       }
       for(int i=0;i<al.size();i++){
        for(int j=i+1;j<al.size();j++){
            if(al.get(i).equals(al.get(j))){
                return false;
            }
        }
       }
       return true; 
    }
}
