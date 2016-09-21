public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public int findPosition(int[] nums, int target) {
        if (nums.length == 0 || nums == null){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while ( start + 1 < end){
            if (A[mid] == target){
                return mid;
            } else if (A[mid] < target){
                start = mid;
            } else {
                end = mid;
            }
        }
        if (A[start] == target){
            return start;
        }
        if (A[end] == target){
            return end;
        }
        return -1
    }
}