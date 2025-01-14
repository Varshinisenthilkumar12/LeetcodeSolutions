package LeetCode;
import java.util.*;
class RemoveElement {
    public int removeElement(int[] nums, int val) {
      int count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[count]=nums[i];
            count=count+1;
        }
      }
      return count;
    }

public static void main(String []args){
    Scanner S=new Scanner(System.in);
    int val=S.nextInt();
    int n=S.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=S.nextInt();
    }
    RemoveElement sol=new RemoveElement();
    sol.removeElement(nums,val);
    S.close();
}
}