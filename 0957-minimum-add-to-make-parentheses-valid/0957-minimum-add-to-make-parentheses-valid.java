class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Integer> st = new Stack<Integer>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            }
            else{
                if (!st.empty()) {
                    st.pop();
                }
                else{
                    count++;
                }
            }
        }
        if (!st.empty()){
            count = count + st.size();
        }
        return count;
    }
}
