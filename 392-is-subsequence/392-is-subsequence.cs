public class Solution {
    public bool IsSubsequence(string s, string t) {
        int slength=s.Length;
        int tlength=t.Length;
        if(tlength<slength){
            return false;
        }
        if (slength == 0){
            return true;
        }
        int c= 0;
        for(int i=0; i< tlength; i++){
            if(t[i] == s[c]){
                c++;
                if(c==slength){
                    return true;
                }
            }
        }
        return false;
    }
    
}