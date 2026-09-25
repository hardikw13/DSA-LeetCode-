class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<> ();

        for(int i =0;i<nums.length;i++){
            int x = nums[i];
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }else{
                hm.put(x,1);
            }
            if(hm.get(x)>2){
                return false;
            }
        }
        return true;
        
    }
}