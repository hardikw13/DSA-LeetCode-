class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm1 = new HashMap<> ();
        HashMap<Character , Character> hm2 = new HashMap<> ();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);

            if(hm1.containsKey(ch) && hm1.get(ch) != ch1){
                return false;
            }
            if(hm2.containsKey(ch1) && hm2.get(ch1)!= ch){
                return false;
            }

            hm1.put(ch,ch1);
            hm2.put(ch1,ch);
        }
        return true;
        
    }
}