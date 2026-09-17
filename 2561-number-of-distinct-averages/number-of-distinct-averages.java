class Solution {
    public int distinctAverages(int[] nums) {
        HashMap<Double,Integer> hm = new HashMap<>();
        Arrays.sort(nums);
        int i =0;
        int j = nums.length -1;
        while(i<j){
            double avg = (nums[i] + nums[j]) /2.0;

            if(hm.containsKey(avg)){
                hm.put(avg,hm.get(avg)+1);
            }else{
                hm.put(avg,1);
            }
            i++;
            j--;
        }
        return hm.size();
    

            }
}