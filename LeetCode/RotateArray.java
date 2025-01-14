
import java.util.Scanner;
class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<=end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;end--;
    }
    }
    public static void main(String[] args){
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int k=S.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=S.nextInt();
    }
    RotateArray sol=new RotateArray();
    sol.rotate(nums,k);
     for (int num : nums) {
            System.out.print(num + " ");
        }
    S.close();
}
}
