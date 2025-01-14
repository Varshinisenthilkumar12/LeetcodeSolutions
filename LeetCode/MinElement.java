import java.util.ArrayList;

class MinElement {
    public int minElement(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> bl=new ArrayList<>();
        int add;
        for(int i=0;i<nums.length;i++){
            bl.add(nums[i]);
        }
        for(int i=0;i<bl.size();i++){
            add=0;
            int k=bl.get(i);
            while(k>0){
                int a=k%10;
                add+=a;
                k=k/10;
            }
            al.add(add);
        }
        int f=Collections.min(al);
        return f;
    }
}