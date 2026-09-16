class Solution {
    public boolean containsDuplicate(int[] nums) {

    // First way
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] == nums[i-1]){
        //         return true;
        //     }
            
        // }
        // return false;
        // Way 2
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                return true;
            }
            hm.put(nums[i],1);
        }
        return false;



        
    }
}