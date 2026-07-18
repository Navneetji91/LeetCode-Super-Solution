class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int i=0;
        int j=n-1;
        while(i<=j){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                arr[n-1]=nums[j]*nums[j];
                n--;
                j--;
            }else{
                arr[n-1]=nums[i]*nums[i];
                n--;
                i++;
            }
        }
        return arr;
    }
}