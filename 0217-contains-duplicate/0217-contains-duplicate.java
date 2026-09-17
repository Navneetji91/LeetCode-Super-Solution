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
        for(int i=0;i<nums.length;i++){
            if(elem.contains(nums[i])){
                return true;
            }
            elem.add(nums[i]);
        }
        
        return false;
    }
}