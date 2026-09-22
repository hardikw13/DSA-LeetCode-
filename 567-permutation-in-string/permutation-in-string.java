class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hm = new HashMap<> ();
        HashMap<Character , Integer> hm2 = new HashMap <> (); 

        for(int i =0;i<s1.length();i++){
            char ch = s1.charAt(i);

            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        int j=0;
        for(int i =0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(hm2.containsKey(ch)){
                hm2.put(ch,hm2.get(ch)+1);
            }else{
                hm2.put(ch,1);
            }

            if(i-j+1>s1.length()){
                char remove = s2.charAt(j);
                if(hm2.containsKey(remove)){
                    hm2.put(remove,hm2.get(remove)-1);
                }
                if(hm2.get(remove) == 0){
                    hm2.remove(remove);
                }
                j++;
            }
            if(hm2.equals(hm)){
                return true;
                            }
        } 
        return false;      
    }
}