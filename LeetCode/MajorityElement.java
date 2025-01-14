package LeetCode;
import java.util.Scanner;
class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cand = 0;
        for (int num : nums) {
            if (count == 0) {
                cand = num; 
            }
            if (num == cand) {
                count++; 
            } else {
                count--; 
            }
        }
        return cand;  
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = S.nextInt();
        }
        MajorityElement sol = new MajorityElement();
        int result = sol.majorityElement(nums);
        S.close();
    }
}

