class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                st.pop();
            }else if(op.equals("D")){
                int last = st.peek();
                st.push(last*2);
                
            }else if(op.equals("+")){
                int last = st.pop();
                int secondlast = st.peek();

                st.push(last);
                st.push(last+secondlast);

            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum =0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
        
    }
}