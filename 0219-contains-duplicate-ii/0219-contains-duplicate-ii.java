class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int n=nums.length;

        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<=i+k && j<n;j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int preIndex=map.get(nums[i]);
                if(i-preIndex <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;

          
    }
}