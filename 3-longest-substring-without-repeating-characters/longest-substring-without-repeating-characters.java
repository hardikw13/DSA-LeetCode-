class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<> ();
        int maxlen =0;
        int j = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                j = Math.max(j,hm.get(ch)+1);

                }

                hm.put(ch,i);
                maxlen = Math.max(maxlen,i-j+1);
                
            }
            return maxlen;

        
    }
}