class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum = 0, count = 0;

        for(final int num : nums)
            if((sum += num) == 0)
                count++;

        return count;
    }
}