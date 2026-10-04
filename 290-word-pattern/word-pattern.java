class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character,String> hm1 = new HashMap <>();
        HashMap<String,Character> hm2 = new HashMap <>();

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String ch1 = words[i];

            if(hm1.containsKey(ch) && !hm1.get(ch).equals(ch1)){
                return false;
            }

            if(hm2.containsKey(ch1) && hm2.get(ch1)!=ch){
                return false;
            }
            hm1.put(ch,ch1);
            hm2.put(ch1,ch);
        }
        return true;
        
    }
}