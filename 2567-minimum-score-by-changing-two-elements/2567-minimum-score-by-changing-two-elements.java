class Solution {
    public int minimizeSum(int[] nums) {
        
        int low=0;
        Arrays.sort(nums);
        int n=nums.length;

        int high=Math.min(nums[n-2]-nums[1],
                Math.min(nums[n-3]-nums[0],nums[n-1]-nums[2])
        );
        return low+high;
    }
}