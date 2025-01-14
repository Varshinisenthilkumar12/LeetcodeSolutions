package LeetCode;
import java.util.*;
class MergeSortArray {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        for (k = m + n - 1; i >= 0 && j >= 0; k--) {
            if(num1[i]<num2[j]){
                num1[k]=num2[j--];
            } 
            else if(num1[i] > num2[j]) {
                num1[k] = num1[i--];
            } else {
                num1[k] = num2[j--];
            }
        }
       for (; j >= 0; j--) {
            num1[k--] = num2[j];
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int num1[]=new int[m];
        int num2[]=new int[n];
        for(int i=0;i<m;i++){
            num1[i]=s.nextInt();
        }
        for(int j=0;j<n;j++){
            num2[j]=s.nextInt();
        }
        MergeSortArray sol = new MergeSortArray();
        sol.merge(num1, m, num2, n);
        s.close();
}
}