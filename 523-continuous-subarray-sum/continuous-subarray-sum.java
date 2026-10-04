class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<> ();

        int sum =0;
        hm.put(0,-1);
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            int rem = sum % k;

            if(hm.containsKey(rem)){
                int len = i-hm.get(rem);

                if(len >=2)
                    return true;
                
                
            }else{
                    hm.put(rem,i);
                }
        }
        return false;

    }
}