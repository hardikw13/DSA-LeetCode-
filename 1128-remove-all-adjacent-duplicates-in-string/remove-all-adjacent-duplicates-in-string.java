class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();


        for(char ch: s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }else{
                char last = st.pop();
                if(last != ch){
                    st.push(last);
                    st.push(ch);
                }
                

            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        return ans;
        
        
    }
}