import java.util.Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
