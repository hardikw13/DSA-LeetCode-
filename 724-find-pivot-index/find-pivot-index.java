class Solution {
    public int pivotIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int prefix =0;
            int suffix =0;
            for(int j =0;j<i;j++){
                prefix +=nums[j];
            }
            for(int k =i+1;k<nums.length;k++){
                suffix +=nums[k];
            }
            if(prefix == suffix){
                return i;
            }
        }
        return -1;
        
    }
}