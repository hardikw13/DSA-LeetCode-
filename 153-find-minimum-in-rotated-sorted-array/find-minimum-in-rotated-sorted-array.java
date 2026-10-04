class Solution {
    public int findMin(int[] nums) {
        
// Easiest method
// for(int i = 1; i < nums.length; i++){
//     min = Math.min(min, nums[i]);
// }

// return min;

// by binary search
    int left =0;
    int right = nums.length-1;
    while(left<right){
        int mid = left + (right-left)/2;
        if(nums[mid]>nums[right]){
            left = mid+1;
        }else{
            right = mid;
        }
    }
    return nums[left];


        
    }
}