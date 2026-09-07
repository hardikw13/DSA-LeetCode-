class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        int maxlen =0;


        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                sum--;
            }else{
                sum++;
            }
            if(hm.containsKey(sum)){
                int len = i- hm.get(sum);
                maxlen = Math.max(maxlen,len);
            }else{
                hm.put(sum,i);
            }

        }
        return maxlen;
        
    }
}