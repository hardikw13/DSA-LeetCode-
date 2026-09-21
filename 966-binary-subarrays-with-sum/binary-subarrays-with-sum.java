class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum =0;
        int count =0;
        hm.put(0,1);
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];

            int rem = sum-goal;
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
            }
            
            if(hm.containsKey(sum)){
                hm.put(sum,hm.get(sum)+1);
            }else{
                hm.put(sum,1);
            }
        }
        return count;
        
    }
}