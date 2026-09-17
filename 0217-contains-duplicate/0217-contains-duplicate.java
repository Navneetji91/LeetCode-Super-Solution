class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;
        HashSet<Integer> elem=new HashSet<>();
        for(int num:nums){
            if(elem.contains(num)){
                return true;
            }
            elem.add(num);
        }
        
        return false;
    }
}