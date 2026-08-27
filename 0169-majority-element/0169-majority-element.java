class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> countMap=new HashMap<>();
        int majorityCount=nums.length/2;

        for(int num : nums){
            int count=countMap.getOrDefault(num,0)+1;

            if(count > majorityCount){
                return num;
            }
            countMap.put(num,count);
        }
        return -1;

    }
}