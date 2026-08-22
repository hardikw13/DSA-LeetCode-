class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total_prod[] = new int[nums.length];
        int forw_prod = 1;
        int prev_prod = 1;
        for(int i=0;i<nums.length;i++){
            total_prod[i] = forw_prod;
            forw_prod *= nums[i];
        }

        for(int j =nums.length-1; j>=0 ;j--){
            total_prod[j] *= prev_prod;
            prev_prod *= nums[j];
        }

        return total_prod;

       

            

            
        
        
    }
}