class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> res(nums.size(),0);
        int n=nums.size();
        int i=0 , j=nums.size()-1;
        while(i<=j){
            if(abs(nums[i])<abs(nums[j])){
                res[n-1]=nums[j]*nums[j];
                n--;
                j--;
            }else{
                res[n-1]=nums[i]*nums[i];
                n--;
                i++;
            }
        }
        return res;
        // for(int n:nums){
        //     res.push_back(n*n);
        // }
        // sort(res.begin(),res.end());
        // return res;
    }
};