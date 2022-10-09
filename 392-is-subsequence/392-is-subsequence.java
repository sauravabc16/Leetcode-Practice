class Solution {
    public boolean isSubsequence(String s, String t) {
        int slength=s.length();
        int tlength=t.length();
        if(tlength<slength){
            return false;
        }
        if (slength == 0){
            return true;
        }
        int c= 0;
        for(int i=0; i< tlength; i++){
            if(t.charAt(i) == s.charAt(c)){
                c++;
                if(c==slength){
                    return true;
                }
            }
        }
        return false;
    }
}